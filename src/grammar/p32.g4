grammar p32;

program: head body EOF;

head: '|{' headElement* '}|';
body: '!{' bodyElement* '}!';

headElement
    : ';' STRING '/;'               # metaElement
    | '*' STRING '/*'               # titleElement
    | '@' STRING '/@'               # baseElement
    | '?' STRING '/?'               # linkElement
    | '`' STRING '/`'               # styleElement
    ;
tableRow
    : '|' tableCell ('|' tableCell)* '+|'
    ;

tableCell
    : content*
    ;
bodyElement
    : heading                      # headingElement
    | '*' content* '/*'            # paragraphElement
    | '@' content* '/@'            # divElement
    | '%' content* '/%'            # spanElement
    | '-' content* '/-'            # listItemElement
    | '&' content* '/&'            # unorderedListElement
    | '$' content* '/$'            # orderedListElement
    | '?' STRING ('/|' STRING)? '/?' # hyperlinkElement
    | '=' STRING ('/|' STRING)? '/=' # imageElement
    | '^' STRING '/^'              # boldText
    | '_' STRING '/_'              # italicText
    | '~' STRING '/~'              # underlineText
    | '+'             # lineBreak
    | '`' STRING '/`'              # codeElement
    | '[' tableRow+ ']'            # tableElement
    | STRING                       # plainText
    | 'F' content* '/F'   # formElement
    | formContent #formContent_1
    | '.' content* '/.'            #footerElement
    | ',' content* '/,'            #headerElement
    ;

formContent
    : '(' label_name=STRING ')'                                                 # formJustLabel
    | '(' 't=' type=STRING  'n=' name=STRING (label_name=STRING)* ')'           # formField
    | '(' 't=' type=STRING  'v=' value=STRING ')'                               # formButton
    | '(' 't=' type=STRING 'n=' name=STRING 'v=' value=STRING ')'               # formCheckBoxRadio
    ;

heading
    : '######' STRING  # h6
    | '#####' STRING   # h5
    | '####' STRING    # h4
    | '###' STRING     # h3
    | '##' STRING      # h2
    | '#' STRING       # h1
    ;

content
    : bodyElement
    | STRING
    ;

STRING: '"' (~["\\] | '\\' .)* '"';
WS: [ \t\r\n]+ -> skip;