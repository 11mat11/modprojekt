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
    | '[' tableHeader '|' tableRow* ']' # tableElement
    | STRING                       # plainText
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

tableHeader: tableCell ('|' tableCell)*;
tableRow: '|' tableCell ('|' tableCell)* '|';
tableCell: content*;


STRING: '"' (~["\\] | '\\' .)* '"';
WS: [ \t\r\n]+ -> skip;