grammar p32;

program: head body EOF;

head: '|{' headElement* '}|';
body: '!{' bodyElement* '}!';

headElement
    : ';' STRING '/;'               # metaElement
    | '*' STRING '/*'               # titleElement
    | '@' STRING '/@'               # baseElement
    | '$' STRING '/$'               # scriptElement
    | '?' STRING '/?'               # linkElement
    | '`' STRING '/`'               # styleElement
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
    | '+' STRING '/+'              # lineBreak
    | '`' STRING '/`'              # codeElement
    | '[' tableHeader '|' tableRow* ']' # tableElement
    | STRING                       # plainText
    ;

heading
    : '#' STRING       # h1
    | '##' STRING      # h2
    | '###' STRING     # h3
    | '####' STRING    # h4
    | '#####' STRING   # h5
    | '######' STRING  # h6
    ;

content
    : bodyElement
    | STRING
    ;

tableHeader: tableCell ('|' tableCell)*;
tableRow: '|' tableCell ('|' tableCell)* '|';
tableCell: content*;

inputType: STRING;
selectName: STRING;
selectOption: '>' STRING ('|' STRING)? '<';

STRING: '"' (~["\\] | '\\' .)* '"';
WS: [ \t\r\n]+ -> skip;