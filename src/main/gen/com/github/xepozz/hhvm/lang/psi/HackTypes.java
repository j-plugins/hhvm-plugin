// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.xepozz.hhvm.lang.psi.impl.*;

public interface HackTypes {

  IElementType ABSTRACT_ENUM_CLASS_DECLARATION = new HackElementType("ABSTRACT_ENUM_CLASS_DECLARATION");
  IElementType ABSTRACT_MODIFIER = new HackElementType("ABSTRACT_MODIFIER");
  IElementType ALIAS_DECLARATION = new HackElementType("ALIAS_DECLARATION");
  IElementType ANONYMOUS_FUNCTION_EXPRESSION = new HackElementType("ANONYMOUS_FUNCTION_EXPRESSION");
  IElementType ARGUMENT = new HackElementType("ARGUMENT");
  IElementType ARGUMENTS = new HackElementType("ARGUMENTS");
  IElementType ARRAY_EXPRESSION = new HackElementType("ARRAY_EXPRESSION");
  IElementType ASYNC_MODIFIER = new HackElementType("ASYNC_MODIFIER");
  IElementType AS_EXPRESSION = new HackElementType("AS_EXPRESSION");
  IElementType ATTRIBUTE_MODIFIER = new HackElementType("ATTRIBUTE_MODIFIER");
  IElementType AWAITABLE_EXPRESSION = new HackElementType("AWAITABLE_EXPRESSION");
  IElementType AWAIT_MODIFIER = new HackElementType("AWAIT_MODIFIER");
  IElementType BINARY_EXPRESSION = new HackElementType("BINARY_EXPRESSION");
  IElementType BRACED_EXPRESSION = new HackElementType("BRACED_EXPRESSION");
  IElementType BREAK_STATEMENT = new HackElementType("BREAK_STATEMENT");
  IElementType CAPABILITY = new HackElementType("CAPABILITY");
  IElementType CAPABILITY_LIST = new HackElementType("CAPABILITY_LIST");
  IElementType CAST_EXPRESSION = new HackElementType("CAST_EXPRESSION");
  IElementType CATCH_CLAUSE = new HackElementType("CATCH_CLAUSE");
  IElementType CLASS_DECLARATION = new HackElementType("CLASS_DECLARATION");
  IElementType COLLECTION_CALL_EXPRESSION = new HackElementType("COLLECTION_CALL_EXPRESSION");
  IElementType COLLECTION_EXPRESSION = new HackElementType("COLLECTION_EXPRESSION");
  IElementType COMPOUND_STATEMENT = new HackElementType("COMPOUND_STATEMENT");
  IElementType CONCURRENT_STATEMENT = new HackElementType("CONCURRENT_STATEMENT");
  IElementType CONST_DECLARATION = new HackElementType("CONST_DECLARATION");
  IElementType CONST_DECLARATOR = new HackElementType("CONST_DECLARATOR");
  IElementType CONTEXT_CONST_DECLARATION = new HackElementType("CONTEXT_CONST_DECLARATION");
  IElementType CONTINUE_STATEMENT = new HackElementType("CONTINUE_STATEMENT");
  IElementType DO_STATEMENT = new HackElementType("DO_STATEMENT");
  IElementType ECHO_STATEMENT = new HackElementType("ECHO_STATEMENT");
  IElementType ELEMENT_INITIALIZER = new HackElementType("ELEMENT_INITIALIZER");
  IElementType EMPTY_STATEMENT = new HackElementType("EMPTY_STATEMENT");
  IElementType ENUMERATOR = new HackElementType("ENUMERATOR");
  IElementType ENUM_CLASS_DECLARATION = new HackElementType("ENUM_CLASS_DECLARATION");
  IElementType ENUM_CLASS_LABEL_EXPRESSION = new HackElementType("ENUM_CLASS_LABEL_EXPRESSION");
  IElementType ENUM_DECLARATION = new HackElementType("ENUM_DECLARATION");
  IElementType EXPRESSION = new HackElementType("EXPRESSION");
  IElementType EXPRESSION_CALL_EXPRESSION = new HackElementType("EXPRESSION_CALL_EXPRESSION");
  IElementType EXPRESSION_STATEMENT = new HackElementType("EXPRESSION_STATEMENT");
  IElementType EXPRESSION_TREE_EXPRESSION = new HackElementType("EXPRESSION_TREE_EXPRESSION");
  IElementType EXTENDS_CLAUSE = new HackElementType("EXTENDS_CLAUSE");
  IElementType FIELD_INITIALIZER = new HackElementType("FIELD_INITIALIZER");
  IElementType FIELD_SPECIFIER = new HackElementType("FIELD_SPECIFIER");
  IElementType FINALLY_CLAUSE = new HackElementType("FINALLY_CLAUSE");
  IElementType FINAL_MODIFIER = new HackElementType("FINAL_MODIFIER");
  IElementType FOREACH_STATEMENT = new HackElementType("FOREACH_STATEMENT");
  IElementType FOR_STATEMENT = new HackElementType("FOR_STATEMENT");
  IElementType FUNCTION_DECLARATION = new HackElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_POINTER_EXPRESSION = new HackElementType("FUNCTION_POINTER_EXPRESSION");
  IElementType FUNCTION_TYPE_SPECIFIER = new HackElementType("FUNCTION_TYPE_SPECIFIER");
  IElementType IF_STATEMENT = new HackElementType("IF_STATEMENT");
  IElementType IMPLEMENTS_CLAUSE = new HackElementType("IMPLEMENTS_CLAUSE");
  IElementType INCLUDE_EXPRESSION = new HackElementType("INCLUDE_EXPRESSION");
  IElementType INOUT_MODIFIER = new HackElementType("INOUT_MODIFIER");
  IElementType INTERFACE_DECLARATION = new HackElementType("INTERFACE_DECLARATION");
  IElementType IS_EXPRESSION = new HackElementType("IS_EXPRESSION");
  IElementType LAMBDA_EXPRESSION = new HackElementType("LAMBDA_EXPRESSION");
  IElementType LIST_EXPRESSION = new HackElementType("LIST_EXPRESSION");
  IElementType LITERAL_EXPRESSION = new HackElementType("LITERAL_EXPRESSION");
  IElementType MEMBER_DECLARATIONS = new HackElementType("MEMBER_DECLARATIONS");
  IElementType METHOD_DECLARATION = new HackElementType("METHOD_DECLARATION");
  IElementType MODULE_ATTRIBUTE = new HackElementType("MODULE_ATTRIBUTE");
  IElementType NAMESPACE_DECLARATION = new HackElementType("NAMESPACE_DECLARATION");
  IElementType NEW_EXPRESSION = new HackElementType("NEW_EXPRESSION");
  IElementType PARAMETER = new HackElementType("PARAMETER");
  IElementType PARAMETERS = new HackElementType("PARAMETERS");
  IElementType PARENTHESIZED_EXPRESSION = new HackElementType("PARENTHESIZED_EXPRESSION");
  IElementType PIPE_VARIABLE_EXPRESSION = new HackElementType("PIPE_VARIABLE_EXPRESSION");
  IElementType POSTFIX_UNARY_EXPRESSION = new HackElementType("POSTFIX_UNARY_EXPRESSION");
  IElementType PREFIXED_STRING_EXPRESSION = new HackElementType("PREFIXED_STRING_EXPRESSION");
  IElementType PREFIX_UNARY_EXPRESSION = new HackElementType("PREFIX_UNARY_EXPRESSION");
  IElementType PROPERTY_DECLARATION = new HackElementType("PROPERTY_DECLARATION");
  IElementType PROPERTY_DECLARATOR = new HackElementType("PROPERTY_DECLARATOR");
  IElementType QUALIFIED_IDENTIFIER_EXPRESSION = new HackElementType("QUALIFIED_IDENTIFIER_EXPRESSION");
  IElementType REQUIRE_EXPRESSION = new HackElementType("REQUIRE_EXPRESSION");
  IElementType REQUIRE_EXTENDS_CLAUSE = new HackElementType("REQUIRE_EXTENDS_CLAUSE");
  IElementType REQUIRE_IMPLEMENTS_CLAUSE = new HackElementType("REQUIRE_IMPLEMENTS_CLAUSE");
  IElementType RETURN_STATEMENT = new HackElementType("RETURN_STATEMENT");
  IElementType SCOPED_IDENTIFIER_EXPRESSION = new HackElementType("SCOPED_IDENTIFIER_EXPRESSION");
  IElementType SCOPE_IDENTIFIER_EXPRESSION = new HackElementType("SCOPE_IDENTIFIER_EXPRESSION");
  IElementType SELECTION_EXPRESSION = new HackElementType("SELECTION_EXPRESSION");
  IElementType SHAPE_EXPRESSION = new HackElementType("SHAPE_EXPRESSION");
  IElementType SHAPE_TYPE_SPECIFIER = new HackElementType("SHAPE_TYPE_SPECIFIER");
  IElementType STATEMENT = new HackElementType("STATEMENT");
  IElementType STATIC_MODIFIER = new HackElementType("STATIC_MODIFIER");
  IElementType SUBSCRIPT_EXPRESSION = new HackElementType("SUBSCRIPT_EXPRESSION");
  IElementType SWITCH_CASE = new HackElementType("SWITCH_CASE");
  IElementType SWITCH_DEFAULT = new HackElementType("SWITCH_DEFAULT");
  IElementType SWITCH_STATEMENT = new HackElementType("SWITCH_STATEMENT");
  IElementType TERNARY_EXPRESSION = new HackElementType("TERNARY_EXPRESSION");
  IElementType THROW_STATEMENT = new HackElementType("THROW_STATEMENT");
  IElementType TRAIT_ALIAS_CLAUSE = new HackElementType("TRAIT_ALIAS_CLAUSE");
  IElementType TRAIT_DECLARATION = new HackElementType("TRAIT_DECLARATION");
  IElementType TRAIT_SELECT_CLAUSE = new HackElementType("TRAIT_SELECT_CLAUSE");
  IElementType TRAIT_USE_CLAUSE = new HackElementType("TRAIT_USE_CLAUSE");
  IElementType TRY_STATEMENT = new HackElementType("TRY_STATEMENT");
  IElementType TUPLE_EXPRESSION = new HackElementType("TUPLE_EXPRESSION");
  IElementType TUPLE_TYPE_SPECIFIER = new HackElementType("TUPLE_TYPE_SPECIFIER");
  IElementType TYPED_ENUMERATOR = new HackElementType("TYPED_ENUMERATOR");
  IElementType TYPE_ARGUMENTS = new HackElementType("TYPE_ARGUMENTS");
  IElementType TYPE_CONSTANT = new HackElementType("TYPE_CONSTANT");
  IElementType TYPE_CONST_DECLARATION = new HackElementType("TYPE_CONST_DECLARATION");
  IElementType TYPE_PARAMETER = new HackElementType("TYPE_PARAMETER");
  IElementType TYPE_PARAMETERS = new HackElementType("TYPE_PARAMETERS");
  IElementType TYPE_SPECIFIER = new HackElementType("TYPE_SPECIFIER");
  IElementType UNSET_STATEMENT = new HackElementType("UNSET_STATEMENT");
  IElementType USE_CLAUSE = new HackElementType("USE_CLAUSE");
  IElementType USE_STATEMENT = new HackElementType("USE_STATEMENT");
  IElementType USE_TYPE = new HackElementType("USE_TYPE");
  IElementType USING_STATEMENT = new HackElementType("USING_STATEMENT");
  IElementType VARIABLE_EXPRESSION = new HackElementType("VARIABLE_EXPRESSION");
  IElementType VARIADIC_MODIFIER = new HackElementType("VARIADIC_MODIFIER");
  IElementType VISIBILITY_MODIFIER = new HackElementType("VISIBILITY_MODIFIER");
  IElementType WHERE_CLAUSE = new HackElementType("WHERE_CLAUSE");
  IElementType WHERE_CONSTRAINT = new HackElementType("WHERE_CONSTRAINT");
  IElementType WHILE_STATEMENT = new HackElementType("WHILE_STATEMENT");
  IElementType XHP_ATTRIBUTE = new HackElementType("XHP_ATTRIBUTE");
  IElementType XHP_ATTRIBUTE_DECLARATION = new HackElementType("XHP_ATTRIBUTE_DECLARATION");
  IElementType XHP_ATTRIBUTE_EXPRESSION = new HackElementType("XHP_ATTRIBUTE_EXPRESSION");
  IElementType XHP_BINARY_EXPRESSION = new HackElementType("XHP_BINARY_EXPRESSION");
  IElementType XHP_CATEGORY_DECLARATION = new HackElementType("XHP_CATEGORY_DECLARATION");
  IElementType XHP_CATEGORY_IDENTIFIER = new HackElementType("XHP_CATEGORY_IDENTIFIER");
  IElementType XHP_CHILDREN_DECLARATION = new HackElementType("XHP_CHILDREN_DECLARATION");
  IElementType XHP_CLASS_ATTRIBUTE = new HackElementType("XHP_CLASS_ATTRIBUTE");
  IElementType XHP_CLASS_IDENTIFIER = new HackElementType("XHP_CLASS_IDENTIFIER");
  IElementType XHP_CLOSE = new HackElementType("XHP_CLOSE");
  IElementType XHP_ENUM_TYPE = new HackElementType("XHP_ENUM_TYPE");
  IElementType XHP_EXPRESSION = new HackElementType("XHP_EXPRESSION");
  IElementType XHP_IDENTIFIER_EXPRESSION = new HackElementType("XHP_IDENTIFIER_EXPRESSION");
  IElementType XHP_MODIFIER = new HackElementType("XHP_MODIFIER");
  IElementType XHP_OPEN = new HackElementType("XHP_OPEN");
  IElementType XHP_OPEN_CLOSE = new HackElementType("XHP_OPEN_CLOSE");
  IElementType XHP_PARENTHESIZED_EXPRESSION = new HackElementType("XHP_PARENTHESIZED_EXPRESSION");
  IElementType XHP_POSTFIX_UNARY_EXPRESSION = new HackElementType("XHP_POSTFIX_UNARY_EXPRESSION");
  IElementType XHP_SPREAD_EXPRESSION = new HackElementType("XHP_SPREAD_EXPRESSION");
  IElementType XHP_STRING = new HackElementType("XHP_STRING");
  IElementType YIELD_EXPRESSION = new HackElementType("YIELD_EXPRESSION");

  IElementType BLOCK_COMMENT = new HackTokenType("block_comment");
  IElementType EXPRESSION_TREE_IDENTIFIER = new HackTokenType("EXPRESSION_TREE_IDENTIFIER");
  IElementType FALSE = new HackTokenType("false");
  IElementType FLOAT = new HackTokenType("float");
  IElementType IDENTIFIER = new HackTokenType("identifier");
  IElementType INLINE_COMMENT = new HackTokenType("inline_comment");
  IElementType INTEGER = new HackTokenType("integer");
  IElementType NULL = new HackTokenType("null");
  IElementType OPEN_TAG = new HackTokenType("OPEN_TAG");
  IElementType STRING = new HackTokenType("string");
  IElementType TRUE = new HackTokenType("true");
  IElementType T_ABSTRACT = new HackTokenType("abstract");
  IElementType T_AND = new HackTokenType("&&");
  IElementType T_APPEND_ASSIGN = new HackTokenType(".=");
  IElementType T_ARRAY = new HackTokenType("array");
  IElementType T_ARRAYKEY = new HackTokenType("arraykey");
  IElementType T_AS = new HackTokenType("as");
  IElementType T_ASYNC = new HackTokenType("async");
  IElementType T_AS_OPTIONAL = new HackTokenType("?as");
  IElementType T_AT = new HackTokenType("@");
  IElementType T_ATTRIBUTE = new HackTokenType("attribute");
  IElementType T_AT_LATEINIT = new HackTokenType("@lateinit");
  IElementType T_AT_REQUIRED = new HackTokenType("@required");
  IElementType T_AWAIT = new HackTokenType("await");
  IElementType T_BACKSLASH = new HackTokenType("\\");
  IElementType T_BIT_AND = new HackTokenType("&");
  IElementType T_BIT_AND_ASSIGN = new HackTokenType("&=");
  IElementType T_BIT_DIV_ASSIGN = new HackTokenType(">>=");
  IElementType T_BIT_MUL_ASSIGN = new HackTokenType("<<=");
  IElementType T_BIT_NOT = new HackTokenType("^");
  IElementType T_BIT_NOT_ASSIGN = new HackTokenType("^=");
  IElementType T_BIT_OR = new HackTokenType("|");
  IElementType T_BIT_OR_ASSIGN = new HackTokenType("|=");
  IElementType T_BOOL = new HackTokenType("bool");
  IElementType T_BREAK = new HackTokenType("break");
  IElementType T_CASE = new HackTokenType("case");
  IElementType T_CATCH = new HackTokenType("catch");
  IElementType T_CATEGORY = new HackTokenType("category");
  IElementType T_CHAIN = new HackTokenType("->");
  IElementType T_CHAIN_OPTIONAL = new HackTokenType("?->");
  IElementType T_CHILDREN = new HackTokenType("children");
  IElementType T_CLASS = new HackTokenType("class");
  IElementType T_CLONE = new HackTokenType("clone");
  IElementType T_COLON = new HackTokenType(":");
  IElementType T_COLON_COLON = new HackTokenType("::");
  IElementType T_COMMA = new HackTokenType(",");
  IElementType T_CONCURRENT = new HackTokenType("concurrent");
  IElementType T_CONST = new HackTokenType("const");
  IElementType T_CONTINUE = new HackTokenType("continue");
  IElementType T_CTX = new HackTokenType("ctx");
  IElementType T_DARRAY = new HackTokenType("darray");
  IElementType T_DEFAULT = new HackTokenType("default");
  IElementType T_DICT = new HackTokenType("dict");
  IElementType T_DIV = new HackTokenType("/");
  IElementType T_DIV_ASSIGN = new HackTokenType("/=");
  IElementType T_DO = new HackTokenType("do");
  IElementType T_DOLLAR = new HackTokenType("$");
  IElementType T_DOLLAR_DOLLAR = new HackTokenType("$$");
  IElementType T_DOT = new HackTokenType(".");
  IElementType T_DYNAMIC = new HackTokenType("dynamic");
  IElementType T_ECHO = new HackTokenType("echo");
  IElementType T_ELSE = new HackTokenType("else");
  IElementType T_ELSEIF = new HackTokenType("elseif");
  IElementType T_EM = new HackTokenType("!");
  IElementType T_ENUM = new HackTokenType("enum");
  IElementType T_EQ = new HackTokenType("=");
  IElementType T_EQ_EQ = new HackTokenType("==");
  IElementType T_EQ_STRICT = new HackTokenType("===");
  IElementType T_EXTENDS = new HackTokenType("extends");
  IElementType T_FINAL = new HackTokenType("final");
  IElementType T_FINALLY = new HackTokenType("finally");
  IElementType T_FLOAT = new HackTokenType("float");
  IElementType T_FOR = new HackTokenType("for");
  IElementType T_FOREACH = new HackTokenType("foreach");
  IElementType T_FUNCTION = new HackTokenType("function");
  IElementType T_GT = new HackTokenType(">");
  IElementType T_GT_EQ = new HackTokenType(">=");
  IElementType T_GT_ET = new HackTokenType("=>");
  IElementType T_GT_GT = new HackTokenType(">>");
  IElementType T_IF = new HackTokenType("if");
  IElementType T_IMPLEMENTS = new HackTokenType("implements");
  IElementType T_INCLUDE = new HackTokenType("include");
  IElementType T_INCLUDE_ONCE = new HackTokenType("include_once");
  IElementType T_INOUT = new HackTokenType("inout");
  IElementType T_INSTEADOF = new HackTokenType("insteadof");
  IElementType T_INT = new HackTokenType("int");
  IElementType T_INTERFACE = new HackTokenType("interface");
  IElementType T_INTERNAL = new HackTokenType("internal");
  IElementType T_IS = new HackTokenType("is");
  IElementType T_KEYSET = new HackTokenType("keyset");
  IElementType T_LAMBDA = new HackTokenType("==>");
  IElementType T_LBRACE = new HackTokenType("{");
  IElementType T_LBRACKET = new HackTokenType("[");
  IElementType T_LIST = new HackTokenType("list");
  IElementType T_LPAREN = new HackTokenType("(");
  IElementType T_LT = new HackTokenType("<");
  IElementType T_LT_EQ = new HackTokenType("<=");
  IElementType T_LT_LT = new HackTokenType("<<");
  IElementType T_LT_SLASH = new HackTokenType("</");
  IElementType T_MINUS = new HackTokenType("-");
  IElementType T_MINUS_ASSIGN = new HackTokenType("-=");
  IElementType T_MINUS_MINUS = new HackTokenType("--");
  IElementType T_MIXED = new HackTokenType("mixed");
  IElementType T_MUL = new HackTokenType("*");
  IElementType T_MUL_ASSIGN = new HackTokenType("*=");
  IElementType T_NAMESPACE = new HackTokenType("namespace");
  IElementType T_NEQ = new HackTokenType("!=");
  IElementType T_NEQ_STRICT = new HackTokenType("!==");
  IElementType T_NEW = new HackTokenType("new");
  IElementType T_NEWTYPE = new HackTokenType("newtype");
  IElementType T_NONNULL = new HackTokenType("nonnull");
  IElementType T_NORETURN = new HackTokenType("noreturn");
  IElementType T_NOTHING = new HackTokenType("nothing");
  IElementType T_NULL = new HackTokenType("null");
  IElementType T_NUM = new HackTokenType("num");
  IElementType T_OR = new HackTokenType("||");
  IElementType T_OR_GT = new HackTokenType("|>");
  IElementType T_OR_VALUE = new HackTokenType("?:");
  IElementType T_OR_VALUE_ASSIGN = new HackTokenType("??=");
  IElementType T_PARENT = new HackTokenType("parent");
  IElementType T_PERCENT = new HackTokenType("%");
  IElementType T_PERCENT_ASSIGN = new HackTokenType("%=");
  IElementType T_PLUS = new HackTokenType("+");
  IElementType T_PLUS_ASSIGN = new HackTokenType("+=");
  IElementType T_PLUS_PLUS = new HackTokenType("++");
  IElementType T_POW = new HackTokenType("**");
  IElementType T_POW_ASSIGN = new HackTokenType("**=");
  IElementType T_PRINT = new HackTokenType("print");
  IElementType T_PRIVATE = new HackTokenType("private");
  IElementType T_PROTECTED = new HackTokenType("protected");
  IElementType T_PUBLIC = new HackTokenType("public");
  IElementType T_QM = new HackTokenType("?");
  IElementType T_QQ = new HackTokenType("??");
  IElementType T_RBRACE = new HackTokenType("}");
  IElementType T_RBRACKET = new HackTokenType("]");
  IElementType T_REIFY = new HackTokenType("reify");
  IElementType T_REQUIRE = new HackTokenType("require");
  IElementType T_REQUIRE_ONCE = new HackTokenType("require_once");
  IElementType T_RESOURCE = new HackTokenType("resource");
  IElementType T_RETURN = new HackTokenType("return");
  IElementType T_RPAREN = new HackTokenType(")");
  IElementType T_SELF = new HackTokenType("self");
  IElementType T_SEMICOLON = new HackTokenType(";");
  IElementType T_SHAPE = new HackTokenType("shape");
  IElementType T_SHARP = new HackTokenType("#");
  IElementType T_SLASH_GT = new HackTokenType("/>");
  IElementType T_SPASESHIP = new HackTokenType("<=>");
  IElementType T_STATIC = new HackTokenType("static");
  IElementType T_STRING = new HackTokenType("string");
  IElementType T_SUPER = new HackTokenType("super");
  IElementType T_SWITCH = new HackTokenType("switch");
  IElementType T_THREE_DOTS = new HackTokenType("...");
  IElementType T_THROW = new HackTokenType("throw");
  IElementType T_TILDA = new HackTokenType("~");
  IElementType T_TRAIT = new HackTokenType("trait");
  IElementType T_TRY = new HackTokenType("try");
  IElementType T_TUPLE = new HackTokenType("tuple");
  IElementType T_TYPE = new HackTokenType("type");
  IElementType T_UNSET = new HackTokenType("unset");
  IElementType T_USE = new HackTokenType("use");
  IElementType T_USING = new HackTokenType("using");
  IElementType T_VARRAY = new HackTokenType("varray");
  IElementType T_VEC = new HackTokenType("vec");
  IElementType T_VOID = new HackTokenType("void");
  IElementType T_WHERE = new HackTokenType("where");
  IElementType T_WHILE = new HackTokenType("while");
  IElementType T_XHP = new HackTokenType("xhp");
  IElementType T_YIELD = new HackTokenType("yield");
  IElementType XHP_COMMENT = new HackTokenType("XHP_COMMENT");
  IElementType XHP_IDENTIFIER_VALUE = new HackTokenType("XHP_IDENTIFIER_VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABSTRACT_ENUM_CLASS_DECLARATION) {
        return new HackAbstractEnumClassDeclarationImpl(node);
      }
      else if (type == ABSTRACT_MODIFIER) {
        return new HackAbstractModifierImpl(node);
      }
      else if (type == ALIAS_DECLARATION) {
        return new HackAliasDeclarationImpl(node);
      }
      else if (type == ANONYMOUS_FUNCTION_EXPRESSION) {
        return new HackAnonymousFunctionExpressionImpl(node);
      }
      else if (type == ARGUMENT) {
        return new HackArgumentImpl(node);
      }
      else if (type == ARGUMENTS) {
        return new HackArgumentsImpl(node);
      }
      else if (type == ARRAY_EXPRESSION) {
        return new HackArrayExpressionImpl(node);
      }
      else if (type == ASYNC_MODIFIER) {
        return new HackAsyncModifierImpl(node);
      }
      else if (type == AS_EXPRESSION) {
        return new HackAsExpressionImpl(node);
      }
      else if (type == ATTRIBUTE_MODIFIER) {
        return new HackAttributeModifierImpl(node);
      }
      else if (type == AWAITABLE_EXPRESSION) {
        return new HackAwaitableExpressionImpl(node);
      }
      else if (type == AWAIT_MODIFIER) {
        return new HackAwaitModifierImpl(node);
      }
      else if (type == BINARY_EXPRESSION) {
        return new HackBinaryExpressionImpl(node);
      }
      else if (type == BRACED_EXPRESSION) {
        return new HackBracedExpressionImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new HackBreakStatementImpl(node);
      }
      else if (type == CAPABILITY) {
        return new HackCapabilityImpl(node);
      }
      else if (type == CAPABILITY_LIST) {
        return new HackCapabilityListImpl(node);
      }
      else if (type == CAST_EXPRESSION) {
        return new HackCastExpressionImpl(node);
      }
      else if (type == CATCH_CLAUSE) {
        return new HackCatchClauseImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new HackClassDeclarationImpl(node);
      }
      else if (type == COLLECTION_CALL_EXPRESSION) {
        return new HackCollectionCallExpressionImpl(node);
      }
      else if (type == COLLECTION_EXPRESSION) {
        return new HackCollectionExpressionImpl(node);
      }
      else if (type == COMPOUND_STATEMENT) {
        return new HackCompoundStatementImpl(node);
      }
      else if (type == CONCURRENT_STATEMENT) {
        return new HackConcurrentStatementImpl(node);
      }
      else if (type == CONST_DECLARATION) {
        return new HackConstDeclarationImpl(node);
      }
      else if (type == CONST_DECLARATOR) {
        return new HackConstDeclaratorImpl(node);
      }
      else if (type == CONTEXT_CONST_DECLARATION) {
        return new HackContextConstDeclarationImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new HackContinueStatementImpl(node);
      }
      else if (type == DO_STATEMENT) {
        return new HackDoStatementImpl(node);
      }
      else if (type == ECHO_STATEMENT) {
        return new HackEchoStatementImpl(node);
      }
      else if (type == ELEMENT_INITIALIZER) {
        return new HackElementInitializerImpl(node);
      }
      else if (type == EMPTY_STATEMENT) {
        return new HackEmptyStatementImpl(node);
      }
      else if (type == ENUMERATOR) {
        return new HackEnumeratorImpl(node);
      }
      else if (type == ENUM_CLASS_DECLARATION) {
        return new HackEnumClassDeclarationImpl(node);
      }
      else if (type == ENUM_CLASS_LABEL_EXPRESSION) {
        return new HackEnumClassLabelExpressionImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new HackEnumDeclarationImpl(node);
      }
      else if (type == EXPRESSION_CALL_EXPRESSION) {
        return new HackExpressionCallExpressionImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new HackExpressionStatementImpl(node);
      }
      else if (type == EXPRESSION_TREE_EXPRESSION) {
        return new HackExpressionTreeExpressionImpl(node);
      }
      else if (type == EXTENDS_CLAUSE) {
        return new HackExtendsClauseImpl(node);
      }
      else if (type == FIELD_INITIALIZER) {
        return new HackFieldInitializerImpl(node);
      }
      else if (type == FIELD_SPECIFIER) {
        return new HackFieldSpecifierImpl(node);
      }
      else if (type == FINALLY_CLAUSE) {
        return new HackFinallyClauseImpl(node);
      }
      else if (type == FINAL_MODIFIER) {
        return new HackFinalModifierImpl(node);
      }
      else if (type == FOREACH_STATEMENT) {
        return new HackForeachStatementImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new HackForStatementImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new HackFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_POINTER_EXPRESSION) {
        return new HackFunctionPointerExpressionImpl(node);
      }
      else if (type == FUNCTION_TYPE_SPECIFIER) {
        return new HackFunctionTypeSpecifierImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new HackIfStatementImpl(node);
      }
      else if (type == IMPLEMENTS_CLAUSE) {
        return new HackImplementsClauseImpl(node);
      }
      else if (type == INCLUDE_EXPRESSION) {
        return new HackIncludeExpressionImpl(node);
      }
      else if (type == INOUT_MODIFIER) {
        return new HackInoutModifierImpl(node);
      }
      else if (type == INTERFACE_DECLARATION) {
        return new HackInterfaceDeclarationImpl(node);
      }
      else if (type == IS_EXPRESSION) {
        return new HackIsExpressionImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION) {
        return new HackLambdaExpressionImpl(node);
      }
      else if (type == LIST_EXPRESSION) {
        return new HackListExpressionImpl(node);
      }
      else if (type == LITERAL_EXPRESSION) {
        return new HackLiteralExpressionImpl(node);
      }
      else if (type == MEMBER_DECLARATIONS) {
        return new HackMemberDeclarationsImpl(node);
      }
      else if (type == METHOD_DECLARATION) {
        return new HackMethodDeclarationImpl(node);
      }
      else if (type == MODULE_ATTRIBUTE) {
        return new HackModuleAttributeImpl(node);
      }
      else if (type == NAMESPACE_DECLARATION) {
        return new HackNamespaceDeclarationImpl(node);
      }
      else if (type == NEW_EXPRESSION) {
        return new HackNewExpressionImpl(node);
      }
      else if (type == PARAMETER) {
        return new HackParameterImpl(node);
      }
      else if (type == PARAMETERS) {
        return new HackParametersImpl(node);
      }
      else if (type == PARENTHESIZED_EXPRESSION) {
        return new HackParenthesizedExpressionImpl(node);
      }
      else if (type == PIPE_VARIABLE_EXPRESSION) {
        return new HackPipeVariableExpressionImpl(node);
      }
      else if (type == POSTFIX_UNARY_EXPRESSION) {
        return new HackPostfixUnaryExpressionImpl(node);
      }
      else if (type == PREFIXED_STRING_EXPRESSION) {
        return new HackPrefixedStringExpressionImpl(node);
      }
      else if (type == PREFIX_UNARY_EXPRESSION) {
        return new HackPrefixUnaryExpressionImpl(node);
      }
      else if (type == PROPERTY_DECLARATION) {
        return new HackPropertyDeclarationImpl(node);
      }
      else if (type == PROPERTY_DECLARATOR) {
        return new HackPropertyDeclaratorImpl(node);
      }
      else if (type == QUALIFIED_IDENTIFIER_EXPRESSION) {
        return new HackQualifiedIdentifierExpressionImpl(node);
      }
      else if (type == REQUIRE_EXPRESSION) {
        return new HackRequireExpressionImpl(node);
      }
      else if (type == REQUIRE_EXTENDS_CLAUSE) {
        return new HackRequireExtendsClauseImpl(node);
      }
      else if (type == REQUIRE_IMPLEMENTS_CLAUSE) {
        return new HackRequireImplementsClauseImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new HackReturnStatementImpl(node);
      }
      else if (type == SCOPED_IDENTIFIER_EXPRESSION) {
        return new HackScopedIdentifierExpressionImpl(node);
      }
      else if (type == SCOPE_IDENTIFIER_EXPRESSION) {
        return new HackScopeIdentifierExpressionImpl(node);
      }
      else if (type == SELECTION_EXPRESSION) {
        return new HackSelectionExpressionImpl(node);
      }
      else if (type == SHAPE_EXPRESSION) {
        return new HackShapeExpressionImpl(node);
      }
      else if (type == SHAPE_TYPE_SPECIFIER) {
        return new HackShapeTypeSpecifierImpl(node);
      }
      else if (type == STATEMENT) {
        return new HackStatementImpl(node);
      }
      else if (type == STATIC_MODIFIER) {
        return new HackStaticModifierImpl(node);
      }
      else if (type == SUBSCRIPT_EXPRESSION) {
        return new HackSubscriptExpressionImpl(node);
      }
      else if (type == SWITCH_CASE) {
        return new HackSwitchCaseImpl(node);
      }
      else if (type == SWITCH_DEFAULT) {
        return new HackSwitchDefaultImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new HackSwitchStatementImpl(node);
      }
      else if (type == TERNARY_EXPRESSION) {
        return new HackTernaryExpressionImpl(node);
      }
      else if (type == THROW_STATEMENT) {
        return new HackThrowStatementImpl(node);
      }
      else if (type == TRAIT_ALIAS_CLAUSE) {
        return new HackTraitAliasClauseImpl(node);
      }
      else if (type == TRAIT_DECLARATION) {
        return new HackTraitDeclarationImpl(node);
      }
      else if (type == TRAIT_SELECT_CLAUSE) {
        return new HackTraitSelectClauseImpl(node);
      }
      else if (type == TRAIT_USE_CLAUSE) {
        return new HackTraitUseClauseImpl(node);
      }
      else if (type == TRY_STATEMENT) {
        return new HackTryStatementImpl(node);
      }
      else if (type == TUPLE_EXPRESSION) {
        return new HackTupleExpressionImpl(node);
      }
      else if (type == TUPLE_TYPE_SPECIFIER) {
        return new HackTupleTypeSpecifierImpl(node);
      }
      else if (type == TYPED_ENUMERATOR) {
        return new HackTypedEnumeratorImpl(node);
      }
      else if (type == TYPE_ARGUMENTS) {
        return new HackTypeArgumentsImpl(node);
      }
      else if (type == TYPE_CONSTANT) {
        return new HackTypeConstantImpl(node);
      }
      else if (type == TYPE_CONST_DECLARATION) {
        return new HackTypeConstDeclarationImpl(node);
      }
      else if (type == TYPE_PARAMETER) {
        return new HackTypeParameterImpl(node);
      }
      else if (type == TYPE_PARAMETERS) {
        return new HackTypeParametersImpl(node);
      }
      else if (type == TYPE_SPECIFIER) {
        return new HackTypeSpecifierImpl(node);
      }
      else if (type == UNSET_STATEMENT) {
        return new HackUnsetStatementImpl(node);
      }
      else if (type == USE_CLAUSE) {
        return new HackUseClauseImpl(node);
      }
      else if (type == USE_STATEMENT) {
        return new HackUseStatementImpl(node);
      }
      else if (type == USE_TYPE) {
        return new HackUseTypeImpl(node);
      }
      else if (type == USING_STATEMENT) {
        return new HackUsingStatementImpl(node);
      }
      else if (type == VARIABLE_EXPRESSION) {
        return new HackVariableExpressionImpl(node);
      }
      else if (type == VARIADIC_MODIFIER) {
        return new HackVariadicModifierImpl(node);
      }
      else if (type == VISIBILITY_MODIFIER) {
        return new HackVisibilityModifierImpl(node);
      }
      else if (type == WHERE_CLAUSE) {
        return new HackWhereClauseImpl(node);
      }
      else if (type == WHERE_CONSTRAINT) {
        return new HackWhereConstraintImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new HackWhileStatementImpl(node);
      }
      else if (type == XHP_ATTRIBUTE) {
        return new HackXhpAttributeImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_DECLARATION) {
        return new HackXhpAttributeDeclarationImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_EXPRESSION) {
        return new HackXhpAttributeExpressionImpl(node);
      }
      else if (type == XHP_BINARY_EXPRESSION) {
        return new HackXhpBinaryExpressionImpl(node);
      }
      else if (type == XHP_CATEGORY_DECLARATION) {
        return new HackXhpCategoryDeclarationImpl(node);
      }
      else if (type == XHP_CATEGORY_IDENTIFIER) {
        return new HackXhpCategoryIdentifierImpl(node);
      }
      else if (type == XHP_CHILDREN_DECLARATION) {
        return new HackXhpChildrenDeclarationImpl(node);
      }
      else if (type == XHP_CLASS_ATTRIBUTE) {
        return new HackXhpClassAttributeImpl(node);
      }
      else if (type == XHP_CLASS_IDENTIFIER) {
        return new HackXhpClassIdentifierImpl(node);
      }
      else if (type == XHP_CLOSE) {
        return new HackXhpCloseImpl(node);
      }
      else if (type == XHP_ENUM_TYPE) {
        return new HackXhpEnumTypeImpl(node);
      }
      else if (type == XHP_EXPRESSION) {
        return new HackXhpExpressionImpl(node);
      }
      else if (type == XHP_IDENTIFIER_EXPRESSION) {
        return new HackXhpIdentifierExpressionImpl(node);
      }
      else if (type == XHP_MODIFIER) {
        return new HackXhpModifierImpl(node);
      }
      else if (type == XHP_OPEN) {
        return new HackXhpOpenImpl(node);
      }
      else if (type == XHP_OPEN_CLOSE) {
        return new HackXhpOpenCloseImpl(node);
      }
      else if (type == XHP_PARENTHESIZED_EXPRESSION) {
        return new HackXhpParenthesizedExpressionImpl(node);
      }
      else if (type == XHP_POSTFIX_UNARY_EXPRESSION) {
        return new HackXhpPostfixUnaryExpressionImpl(node);
      }
      else if (type == XHP_SPREAD_EXPRESSION) {
        return new HackXhpSpreadExpressionImpl(node);
      }
      else if (type == XHP_STRING) {
        return new HackXhpStringImpl(node);
      }
      else if (type == YIELD_EXPRESSION) {
        return new HackYieldExpressionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
