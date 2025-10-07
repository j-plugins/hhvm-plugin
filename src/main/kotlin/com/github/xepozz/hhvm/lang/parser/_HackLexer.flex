package com.github.xepozz.hhvm.lang.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.xepozz.hhvm.lang.psi.HackTypes.*;

%%

%{
  public _HackLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _HackLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

OPEN_TAG='<?'[hH][hH]?
IDENTIFIER=[a-zA-Z_\x80-\xff][a-zA-Z0-9_\x80-\xff]*
EXPRESSION_TREE_IDENTIFIER=`[^`]*`
INLINE_COMMENT=( "//" [^\r\n]* )
BLOCK_COMMENT=( "/"\* ([^*] | \*+[^*/])* \*+"/" )
FLOAT=( [0-9]+\.[0-9]*([eE][+-]?[0-9]+)? | [0-9]*\.[0-9]+([eE][+-]?[0-9]+)? | [0-9]+[eE][+-]?[0-9]+ )
INTEGER=( [1-9][0-9]* | '0'[0-7]* | '0'[xX][0-9a-fA-F]+ | '0'[bB][01]+ )
TRUE=('true' | 'True'| 'TRUE')
FALSE=('false' | 'False'| 'FALSE')
NULL=('null' | 'Null'| 'NULL')
STRING=(\"([^\\\"]|\\.)*\"|'([^\']|\\.)*')

%%
<YYINITIAL> {
  {WHITE_SPACE}                      { return WHITE_SPACE; }

  "="                                { return T_EQ; }
  "<"                                { return T_LT; }
  ">"                                { return T_GT; }
  "<<"                               { return T_LT_LT; }
  ">>"                               { return T_GT_GT; }
  "{"                                { return T_LBRACE; }
  "}"                                { return T_RBRACE; }
  ":"                                { return T_COLON; }
  "::"                               { return T_COLON_COLON; }
  ";"                                { return T_SEMICOLON; }
  ","                                { return T_COMMA; }
  "."                                { return T_DOT; }
  "..."                              { return T_THREE_DOTS; }
  "("                                { return T_LPAREN; }
  ")"                                { return T_RPAREN; }
  "["                                { return T_LBRACKET; }
  "]"                                { return T_RBRACKET; }
  "\\"                               { return T_BACKSLASH; }
  "==>"                              { return T_LAMBDA; }
  "=>"                               { return T_GT_ET; }
  "+"                                { return T_PLUS; }
  "++"                               { return T_PLUS_PLUS; }
  "-"                                { return T_MINUS; }
  "--"                               { return T_MINUS_MINUS; }
  "?"                                { return T_QM; }
  "!"                                { return T_EM; }
  "$"                                { return T_DOLLAR; }
  "$$"                               { return T_DOLLAR_DOLLAR; }
  "??"                               { return T_QQ; }
  "||"                               { return T_OR; }
  "&&"                               { return T_AND; }
  "|"                                { return T_BIT_OR; }
  "^"                                { return T_BIT_NOT; }
  "&"                                { return T_BIT_AND; }
  "=="                               { return T_EQ_EQ; }
  "!="                               { return T_NEQ; }
  "==="                              { return T_EQ_STRICT; }
  "!=="                              { return T_NEQ_STRICT; }
  "<="                               { return T_LT_EQ; }
  ">="                               { return T_GT_EQ; }
  "<=>"                              { return T_SPASESHIP; }
  "*"                                { return T_MUL; }
  "/"                                { return T_DIV; }
  "%"                                { return T_PERCENT; }
  "**"                               { return T_POW; }
  "?:"                               { return T_OR_VALUE; }
  "??="                              { return T_OR_VALUE_ASSIGN; }
  ".="                               { return T_APPEND_ASSIGN; }
  "|="                               { return T_BIT_OR_ASSIGN; }
  "^="                               { return T_BIT_NOT_ASSIGN; }
  "&="                               { return T_BIT_AND_ASSIGN; }
  "<<="                              { return T_BIT_MUL_ASSIGN; }
  ">>="                              { return T_BIT_DIV_ASSIGN; }
  "+="                               { return T_PLUS_ASSIGN; }
  "-="                               { return T_MINUS_ASSIGN; }
  "*="                               { return T_MUL_ASSIGN; }
  "/="                               { return T_DIV_ASSIGN; }
  "%="                               { return T_PERCENT_ASSIGN; }
  "**="                              { return T_POW_ASSIGN; }
  "@"                                { return T_AT; }
  "~"                                { return T_TILDA; }
  "?->"                              { return T_CHAIN_OPTIONAL; }
  "->"                               { return T_CHAIN; }
  "#"                                { return T_SHARP; }
  "throw"                            { return T_THROW; }
  "return"                           { return T_RETURN; }
  "break"                            { return T_BREAK; }
  "continue"                         { return T_CONTINUE; }
  "echo"                             { return T_ECHO; }
  "unset"                            { return T_UNSET; }
  "concurrent"                       { return T_CONCURRENT; }
  "use"                              { return T_USE; }
  "namespace"                        { return T_NAMESPACE; }
  "function"                         { return T_FUNCTION; }
  "type"                             { return T_TYPE; }
  "const"                            { return T_CONST; }
  "as"                               { return T_AS; }
  "if"                               { return T_IF; }
  "switch"                           { return T_SWITCH; }
  "case"                             { return T_CASE; }
  "default"                          { return T_DEFAULT; }
  "foreach"                          { return T_FOREACH; }
  "while"                            { return T_WHILE; }
  "do"                               { return T_DO; }
  "for"                              { return T_FOR; }
  "try"                              { return T_TRY; }
  "catch"                            { return T_CATCH; }
  "finally"                          { return T_FINALLY; }
  "elseif"                           { return T_ELSEIF; }
  "else"                             { return T_ELSE; }
  "using"                            { return T_USING; }
  "array"                            { return T_ARRAY; }
  "varray"                           { return T_VARRAY; }
  "darray"                           { return T_DARRAY; }
  "vec"                              { return T_VEC; }
  "dict"                             { return T_DICT; }
  "keyset"                           { return T_KEYSET; }
  "bool"                             { return T_BOOL; }
  "float"                            { return T_FLOAT; }
  "int"                              { return T_INT; }
  "num"                              { return T_NUM; }
  "string"                           { return T_STRING; }
  "arraykey"                         { return T_ARRAYKEY; }
  "void"                             { return T_VOID; }
  "nonnull"                          { return T_NONNULL; }
  "mixed"                            { return T_MIXED; }
  "dynamic"                          { return T_DYNAMIC; }
  "noreturn"                         { return T_NORETURN; }
  "nothing"                          { return T_NOTHING; }
  "resource"                         { return T_RESOURCE; }
  "null"                             { return T_NULL; }
  "shape"                            { return T_SHAPE; }
  "where"                            { return T_WHERE; }
  "reify"                            { return T_REIFY; }
  "super"                            { return T_SUPER; }
  "require"                          { return T_REQUIRE; }
  "require_once"                     { return T_REQUIRE_ONCE; }
  "include"                          { return T_INCLUDE; }
  "include_once"                     { return T_INCLUDE_ONCE; }
  "self"                             { return T_SELF; }
  "parent"                           { return T_PARENT; }
  "static"                           { return T_STATIC; }
  "final"                            { return T_FINAL; }
  "abstract"                         { return T_ABSTRACT; }
  "xhp"                              { return T_XHP; }
  "public"                           { return T_PUBLIC; }
  "protected"                        { return T_PROTECTED; }
  "private"                          { return T_PRIVATE; }
  "internal"                         { return T_INTERNAL; }
  "inout"                            { return T_INOUT; }
  "async"                            { return T_ASYNC; }
  "await"                            { return T_AWAIT; }
  "enum"                             { return T_ENUM; }
  "class"                            { return T_CLASS; }
  "is"                               { return T_IS; }
  "yield"                            { return T_YIELD; }
  "print"                            { return T_PRINT; }
  "newtype"                          { return T_NEWTYPE; }
  "tuple"                            { return T_TUPLE; }
  "clone"                            { return T_CLONE; }
  "?as"                              { return T_AS_OPTIONAL; }
  "new"                              { return T_NEW; }
  "insteadof"                        { return T_INSTEADOF; }
  "trait"                            { return T_TRAIT; }
  "interface"                        { return T_INTERFACE; }
  "extends"                          { return T_EXTENDS; }
  "implements"                       { return T_IMPLEMENTS; }
  "ctx"                              { return T_CTX; }
  "T_LIST"                           { return T_LIST; }

  {OPEN_TAG}                         { return OPEN_TAG; }
  {IDENTIFIER}                       { return IDENTIFIER; }
  {EXPRESSION_TREE_IDENTIFIER}       { return EXPRESSION_TREE_IDENTIFIER; }
  {INLINE_COMMENT}                   { return INLINE_COMMENT; }
  {BLOCK_COMMENT}                    { return BLOCK_COMMENT; }
  {FLOAT}                            { return FLOAT; }
  {INTEGER}                          { return INTEGER; }
  {TRUE}                             { return TRUE; }
  {FALSE}                            { return FALSE; }
  {NULL}                             { return NULL; }
  {STRING}                           { return STRING; }

}

[^] { return BAD_CHARACTER; }
