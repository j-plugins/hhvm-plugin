// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.xepozz.hhvm.lang.psi.HackTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class HackParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return hackFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(BREAK_STATEMENT, COMPOUND_STATEMENT, CONCURRENT_STATEMENT, CONTINUE_STATEMENT,
      DO_STATEMENT, ECHO_STATEMENT, EMPTY_STATEMENT, EXPRESSION_STATEMENT,
      FOREACH_STATEMENT, FOR_STATEMENT, IF_STATEMENT, RETURN_STATEMENT,
      STATEMENT, SWITCH_STATEMENT, THROW_STATEMENT, TRY_STATEMENT,
      UNSET_STATEMENT, USE_STATEMENT, USING_STATEMENT, WHILE_STATEMENT),
    create_token_set_(ANONYMOUS_FUNCTION_EXPRESSION, ARRAY_EXPRESSION, AS_EXPRESSION, AWAITABLE_EXPRESSION,
      BINARY_EXPRESSION, BRACED_EXPRESSION, CAST_EXPRESSION, COLLECTION_CALL_EXPRESSION,
      COLLECTION_EXPRESSION, ENUM_CLASS_LABEL_EXPRESSION, EXPRESSION, EXPRESSION_CALL_EXPRESSION,
      EXPRESSION_TREE_EXPRESSION, FUNCTION_POINTER_EXPRESSION, INCLUDE_EXPRESSION, IS_EXPRESSION,
      LAMBDA_EXPRESSION, LIST_EXPRESSION, LITERAL_EXPRESSION, NEW_EXPRESSION,
      PARENTHESIZED_EXPRESSION, PIPE_VARIABLE_EXPRESSION, POSTFIX_UNARY_EXPRESSION, PREFIXED_STRING_EXPRESSION,
      PREFIX_UNARY_EXPRESSION, QUALIFIED_IDENTIFIER_EXPRESSION, REQUIRE_EXPRESSION, SCOPED_IDENTIFIER_EXPRESSION,
      SCOPE_IDENTIFIER_EXPRESSION, SELECTION_EXPRESSION, SHAPE_EXPRESSION, SUBSCRIPT_EXPRESSION,
      TERNARY_EXPRESSION, TUPLE_EXPRESSION, VARIABLE_EXPRESSION, YIELD_EXPRESSION),
  };

  /* ********************************************************** */
  // attribute_modifier? T_ABSTRACT T_ENUM T_CLASS identifier T_COLON extends_clause? type T_LBRACE ( typed_enumerator | T_ABSTRACT type identifier T_SEMICOLON )* T_RBRACE
  public static boolean abstract_enum_class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_enum_class_declaration")) return false;
    if (!nextTokenIs(b, "<abstract enum class declaration>", T_ABSTRACT, T_LT_LT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACT_ENUM_CLASS_DECLARATION, "<abstract enum class declaration>");
    r = abstract_enum_class_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, T_ABSTRACT, T_ENUM, T_CLASS, IDENTIFIER, T_COLON);
    r = r && abstract_enum_class_declaration_6(b, l + 1);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && abstract_enum_class_declaration_9(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean abstract_enum_class_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_enum_class_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // extends_clause?
  private static boolean abstract_enum_class_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_enum_class_declaration_6")) return false;
    extends_clause(b, l + 1);
    return true;
  }

  // ( typed_enumerator | T_ABSTRACT type identifier T_SEMICOLON )*
  private static boolean abstract_enum_class_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_enum_class_declaration_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!abstract_enum_class_declaration_9_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abstract_enum_class_declaration_9", c)) break;
    }
    return true;
  }

  // typed_enumerator | T_ABSTRACT type identifier T_SEMICOLON
  private static boolean abstract_enum_class_declaration_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_enum_class_declaration_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typed_enumerator(b, l + 1);
    if (!r) r = abstract_enum_class_declaration_9_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_ABSTRACT type identifier T_SEMICOLON
  private static boolean abstract_enum_class_declaration_9_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_enum_class_declaration_9_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ABSTRACT);
    r = r && type(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_ABSTRACT
  public static boolean abstract_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_modifier")) return false;
    if (!nextTokenIs(b, T_ABSTRACT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ABSTRACT);
    exit_section_(b, m, ABSTRACT_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // attribute_modifier? ( T_TYPE | T_NEWTYPE ) identifier type_parameters? ( T_AS type )? T_EQ type T_SEMICOLON
  public static boolean alias_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_DECLARATION, "<alias declaration>");
    r = alias_declaration_0(b, l + 1);
    r = r && alias_declaration_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && alias_declaration_3(b, l + 1);
    r = r && alias_declaration_4(b, l + 1);
    r = r && consumeToken(b, T_EQ);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean alias_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // T_TYPE | T_NEWTYPE
  private static boolean alias_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_1")) return false;
    boolean r;
    r = consumeToken(b, T_TYPE);
    if (!r) r = consumeToken(b, T_NEWTYPE);
    return r;
  }

  // type_parameters?
  private static boolean alias_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_3")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // ( T_AS type )?
  private static boolean alias_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_4")) return false;
    alias_declaration_4_0(b, l + 1);
    return true;
  }

  // T_AS type
  private static boolean alias_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_USE T_LPAREN variable_expression ( T_COMMA variable_expression )* T_COMMA? T_RPAREN
  static boolean anonymous_function_use_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_use_clause")) return false;
    if (!nextTokenIs(b, T_USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_USE, T_LPAREN);
    r = r && variable_expression(b, l + 1);
    r = r && anonymous_function_use_clause_3(b, l + 1);
    r = r && anonymous_function_use_clause_4(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA variable_expression )*
  private static boolean anonymous_function_use_clause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_use_clause_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!anonymous_function_use_clause_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "anonymous_function_use_clause_3", c)) break;
    }
    return true;
  }

  // T_COMMA variable_expression
  private static boolean anonymous_function_use_clause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_use_clause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && variable_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean anonymous_function_use_clause_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_use_clause_4")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // ( inout_modifier | variadic_modifier )? expression
  public static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT, "<argument>");
    r = argument_0(b, l + 1);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( inout_modifier | variadic_modifier )?
  private static boolean argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0")) return false;
    argument_0_0(b, l + 1);
    return true;
  }

  // inout_modifier | variadic_modifier
  private static boolean argument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0_0")) return false;
    boolean r;
    r = inout_modifier(b, l + 1);
    if (!r) r = variadic_modifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // T_LPAREN ( argument ( T_COMMA argument )* T_COMMA? )? T_RPAREN
  public static boolean arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && arguments_1(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, ARGUMENTS, r);
    return r;
  }

  // ( argument ( T_COMMA argument )* T_COMMA? )?
  private static boolean arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1")) return false;
    arguments_1_0(b, l + 1);
    return true;
  }

  // argument ( T_COMMA argument )* T_COMMA?
  private static boolean arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argument(b, l + 1);
    r = r && arguments_1_0_1(b, l + 1);
    r = r && arguments_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA argument )*
  private static boolean arguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arguments_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arguments_1_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA argument
  private static boolean arguments_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean arguments_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_ASYNC
  public static boolean async_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "async_modifier")) return false;
    if (!nextTokenIs(b, T_ASYNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ASYNC);
    exit_section_(b, m, ASYNC_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // T_LT_LT qualified_identifier_expression arguments? ( T_COMMA qualified_identifier_expression arguments? )* T_COMMA? T_GT_GT
  public static boolean attribute_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_modifier")) return false;
    if (!nextTokenIs(b, T_LT_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LT_LT);
    r = r && qualified_identifier_expression(b, l + 1);
    r = r && attribute_modifier_2(b, l + 1);
    r = r && attribute_modifier_3(b, l + 1);
    r = r && attribute_modifier_4(b, l + 1);
    r = r && consumeToken(b, T_GT_GT);
    exit_section_(b, m, ATTRIBUTE_MODIFIER, r);
    return r;
  }

  // arguments?
  private static boolean attribute_modifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_modifier_2")) return false;
    arguments(b, l + 1);
    return true;
  }

  // ( T_COMMA qualified_identifier_expression arguments? )*
  private static boolean attribute_modifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_modifier_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute_modifier_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attribute_modifier_3", c)) break;
    }
    return true;
  }

  // T_COMMA qualified_identifier_expression arguments?
  private static boolean attribute_modifier_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_modifier_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && qualified_identifier_expression(b, l + 1);
    r = r && attribute_modifier_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arguments?
  private static boolean attribute_modifier_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_modifier_3_0_2")) return false;
    arguments(b, l + 1);
    return true;
  }

  // T_COMMA?
  private static boolean attribute_modifier_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_modifier_4")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_AWAIT
  public static boolean await_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "await_modifier")) return false;
    if (!nextTokenIs(b, T_AWAIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AWAIT);
    exit_section_(b, m, AWAIT_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // T_LBRACE expression T_RBRACE
  public static boolean braced_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "braced_expression")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, BRACED_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // T_BREAK expression? T_SEMICOLON
  public static boolean break_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement")) return false;
    if (!nextTokenIs(b, T_BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_BREAK);
    r = r && break_statement_1(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, BREAK_STATEMENT, r);
    return r;
  }

  // expression?
  private static boolean break_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement_1")) return false;
    expression(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // identifier type_parameters?
  // 	| scoped_identifier_expression
  // 	| T_CTX variable_expression
  public static boolean capability(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capability")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAPABILITY, "<capability>");
    r = capability_0(b, l + 1);
    if (!r) r = scoped_identifier_expression(b, l + 1);
    if (!r) r = capability_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier type_parameters?
  private static boolean capability_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capability_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && capability_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_parameters?
  private static boolean capability_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capability_0_1")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // T_CTX variable_expression
  private static boolean capability_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capability_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CTX);
    r = r && variable_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_LBRACKET ( capability ( T_COMMA capability )* )? T_RBRACKET
  public static boolean capability_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capability_list")) return false;
    if (!nextTokenIs(b, T_LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACKET);
    r = r && capability_list_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACKET);
    exit_section_(b, m, CAPABILITY_LIST, r);
    return r;
  }

  // ( capability ( T_COMMA capability )* )?
  private static boolean capability_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capability_list_1")) return false;
    capability_list_1_0(b, l + 1);
    return true;
  }

  // capability ( T_COMMA capability )*
  private static boolean capability_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capability_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = capability(b, l + 1);
    r = r && capability_list_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA capability )*
  private static boolean capability_list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capability_list_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!capability_list_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "capability_list_1_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA capability
  private static boolean capability_list_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capability_list_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && capability(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_CATCH T_LPAREN type variable_expression T_RPAREN compound_statement
  public static boolean catch_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clause")) return false;
    if (!nextTokenIs(b, T_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_CATCH, T_LPAREN);
    r = r && type(b, l + 1);
    r = r && variable_expression(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, CATCH_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // member_modifier* T_CONST type? class_const_declarator ( T_COMMA class_const_declarator )* T_SEMICOLON
  static boolean class_const_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_const_declaration_0(b, l + 1);
    r = r && consumeToken(b, T_CONST);
    r = r && class_const_declaration_2(b, l + 1);
    r = r && class_const_declarator(b, l + 1);
    r = r && class_const_declaration_4(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // member_modifier*
  private static boolean class_const_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_const_declaration_0", c)) break;
    }
    return true;
  }

  // type?
  private static boolean class_const_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declaration_2")) return false;
    type(b, l + 1);
    return true;
  }

  // ( T_COMMA class_const_declarator )*
  private static boolean class_const_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declaration_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_const_declaration_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_const_declaration_4", c)) break;
    }
    return true;
  }

  // T_COMMA class_const_declarator
  private static boolean class_const_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && class_const_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( identifier | keyword ) ( T_EQ expression )?
  static boolean class_const_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_const_declarator_0(b, l + 1);
    r = r && class_const_declarator_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier | keyword
  private static boolean class_const_declarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declarator_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = keyword(b, l + 1);
    return r;
  }

  // ( T_EQ expression )?
  private static boolean class_const_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declarator_1")) return false;
    class_const_declarator_1_0(b, l + 1);
    return true;
  }

  // T_EQ expression
  private static boolean class_const_declarator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declarator_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQ);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attribute_modifier? class_modifier? class_modifier? T_CLASS ( identifier ) type_parameters? extends_clause? implements_clause? where_clause? member_declarations
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = class_declaration_0(b, l + 1);
    r = r && class_declaration_1(b, l + 1);
    r = r && class_declaration_2(b, l + 1);
    r = r && consumeToken(b, T_CLASS);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && class_declaration_5(b, l + 1);
    r = r && class_declaration_6(b, l + 1);
    r = r && class_declaration_7(b, l + 1);
    r = r && class_declaration_8(b, l + 1);
    r = r && member_declarations(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean class_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // class_modifier?
  private static boolean class_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_1")) return false;
    class_modifier(b, l + 1);
    return true;
  }

  // class_modifier?
  private static boolean class_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_2")) return false;
    class_modifier(b, l + 1);
    return true;
  }

  // type_parameters?
  private static boolean class_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_5")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // extends_clause?
  private static boolean class_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_6")) return false;
    extends_clause(b, l + 1);
    return true;
  }

  // implements_clause?
  private static boolean class_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_7")) return false;
    implements_clause(b, l + 1);
    return true;
  }

  // where_clause?
  private static boolean class_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_8")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // abstract_modifier
  // 	| final_modifier
  static boolean class_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_modifier")) return false;
    if (!nextTokenIs(b, "", T_ABSTRACT, T_FINAL)) return false;
    boolean r;
    r = abstract_modifier(b, l + 1);
    if (!r) r = final_modifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // T_ARRAY
  // 	| T_VARRAY
  // 	| T_DARRAY
  // 	| T_VEC
  // 	| T_DICT
  // 	| T_KEYSET
  static boolean collection_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_type")) return false;
    boolean r;
    r = consumeToken(b, T_ARRAY);
    if (!r) r = consumeToken(b, T_VARRAY);
    if (!r) r = consumeToken(b, T_DARRAY);
    if (!r) r = consumeToken(b, T_VEC);
    if (!r) r = consumeToken(b, T_DICT);
    if (!r) r = consumeToken(b, T_KEYSET);
    return r;
  }

  /* ********************************************************** */
  // T_LBRACE statement* T_RBRACE
  public static boolean compound_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_statement")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && compound_statement_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, COMPOUND_STATEMENT, r);
    return r;
  }

  // statement*
  private static boolean compound_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compound_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // T_CONCURRENT compound_statement
  public static boolean concurrent_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_statement")) return false;
    if (!nextTokenIs(b, T_CONCURRENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CONCURRENT);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, CONCURRENT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // T_CONST type? const_declarator ( T_COMMA const_declarator )* T_SEMICOLON
  public static boolean const_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declaration")) return false;
    if (!nextTokenIs(b, T_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CONST);
    r = r && const_declaration_1(b, l + 1);
    r = r && const_declarator(b, l + 1);
    r = r && const_declaration_3(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, CONST_DECLARATION, r);
    return r;
  }

  // type?
  private static boolean const_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declaration_1")) return false;
    type(b, l + 1);
    return true;
  }

  // ( T_COMMA const_declarator )*
  private static boolean const_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!const_declaration_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "const_declaration_3", c)) break;
    }
    return true;
  }

  // T_COMMA const_declarator
  private static boolean const_declaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && const_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( identifier | keyword ) ( T_EQ expression )
  public static boolean const_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_DECLARATOR, "<const declarator>");
    r = const_declarator_0(b, l + 1);
    r = r && const_declarator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier | keyword
  private static boolean const_declarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declarator_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = keyword(b, l + 1);
    return r;
  }

  // T_EQ expression
  private static boolean const_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQ);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // abstract_modifier? T_CONST T_CTX identifier ( T_SUPER capability_list )? ( T_AS capability_list )? ( T_EQ capability_list )? T_SEMICOLON
  public static boolean context_const_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_const_declaration")) return false;
    if (!nextTokenIs(b, "<context const declaration>", T_ABSTRACT, T_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTEXT_CONST_DECLARATION, "<context const declaration>");
    r = context_const_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, T_CONST, T_CTX, IDENTIFIER);
    r = r && context_const_declaration_4(b, l + 1);
    r = r && context_const_declaration_5(b, l + 1);
    r = r && context_const_declaration_6(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // abstract_modifier?
  private static boolean context_const_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_const_declaration_0")) return false;
    abstract_modifier(b, l + 1);
    return true;
  }

  // ( T_SUPER capability_list )?
  private static boolean context_const_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_const_declaration_4")) return false;
    context_const_declaration_4_0(b, l + 1);
    return true;
  }

  // T_SUPER capability_list
  private static boolean context_const_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_const_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SUPER);
    r = r && capability_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_AS capability_list )?
  private static boolean context_const_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_const_declaration_5")) return false;
    context_const_declaration_5_0(b, l + 1);
    return true;
  }

  // T_AS capability_list
  private static boolean context_const_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_const_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && capability_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_EQ capability_list )?
  private static boolean context_const_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_const_declaration_6")) return false;
    context_const_declaration_6_0(b, l + 1);
    return true;
  }

  // T_EQ capability_list
  private static boolean context_const_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_const_declaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQ);
    r = r && capability_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_CONTINUE expression? T_SEMICOLON
  public static boolean continue_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement")) return false;
    if (!nextTokenIs(b, T_CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CONTINUE);
    r = r && continue_statement_1(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, CONTINUE_STATEMENT, r);
    return r;
  }

  // expression?
  private static boolean continue_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement_1")) return false;
    expression(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // function_declaration
  // 	| class_declaration
  // 	| interface_declaration
  // 	| trait_declaration
  // 	| alias_declaration
  // 	| enum_declaration
  // 	| abstract_enum_class_declaration
  // 	| enum_class_declaration
  // 	| namespace_declaration
  // 	| const_declaration
  static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    r = function_declaration(b, l + 1);
    if (!r) r = class_declaration(b, l + 1);
    if (!r) r = interface_declaration(b, l + 1);
    if (!r) r = trait_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = abstract_enum_class_declaration(b, l + 1);
    if (!r) r = enum_class_declaration(b, l + 1);
    if (!r) r = namespace_declaration(b, l + 1);
    if (!r) r = const_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // T_DO statement T_WHILE parenthesized_expression T_SEMICOLON
  public static boolean do_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_statement")) return false;
    if (!nextTokenIs(b, T_DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DO);
    r = r && statement(b, l + 1);
    r = r && consumeToken(b, T_WHILE);
    r = r && parenthesized_expression(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, DO_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // T_ECHO expression ( T_COMMA expression )* T_SEMICOLON
  public static boolean echo_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "echo_statement")) return false;
    if (!nextTokenIs(b, T_ECHO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ECHO);
    r = r && expression(b, l + 1, -1);
    r = r && echo_statement_2(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, ECHO_STATEMENT, r);
    return r;
  }

  // ( T_COMMA expression )*
  private static boolean echo_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "echo_statement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!echo_statement_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "echo_statement_2", c)) break;
    }
    return true;
  }

  // T_COMMA expression
  private static boolean echo_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "echo_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression T_GT_ET expression
  public static boolean element_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_INITIALIZER, "<element initializer>");
    r = expression(b, l + 1, -1);
    r = r && consumeToken(b, T_GT_ET);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_SEMICOLON
  public static boolean empty_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "empty_statement")) return false;
    if (!nextTokenIs(b, T_SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, EMPTY_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // attribute_modifier? T_ENUM T_CLASS identifier T_COLON type extends_clause? T_LBRACE typed_enumerator* T_RBRACE
  public static boolean enum_class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_class_declaration")) return false;
    if (!nextTokenIs(b, "<enum class declaration>", T_ENUM, T_LT_LT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_CLASS_DECLARATION, "<enum class declaration>");
    r = enum_class_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, T_ENUM, T_CLASS, IDENTIFIER, T_COLON);
    r = r && type(b, l + 1);
    r = r && enum_class_declaration_6(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && enum_class_declaration_8(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean enum_class_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_class_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // extends_clause?
  private static boolean enum_class_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_class_declaration_6")) return false;
    extends_clause(b, l + 1);
    return true;
  }

  // typed_enumerator*
  private static boolean enum_class_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_class_declaration_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typed_enumerator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_class_declaration_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // attribute_modifier? T_ENUM identifier T_COLON type ( T_AS type )? T_LBRACE enumerator* T_RBRACE
  public static boolean enum_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration")) return false;
    if (!nextTokenIs(b, "<enum declaration>", T_ENUM, T_LT_LT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DECLARATION, "<enum declaration>");
    r = enum_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, T_ENUM, IDENTIFIER, T_COLON);
    r = r && type(b, l + 1);
    r = r && enum_declaration_5(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && enum_declaration_7(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean enum_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // ( T_AS type )?
  private static boolean enum_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_5")) return false;
    enum_declaration_5_0(b, l + 1);
    return true;
  }

  // T_AS type
  private static boolean enum_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // enumerator*
  private static boolean enum_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enumerator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier T_EQ expression T_SEMICOLON
  public static boolean enumerator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, T_EQ);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, ENUMERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // expression T_SEMICOLON
  public static boolean expression_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = expression(b, l + 1, -1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_EXTENDS type ( T_COMMA type )*
  public static boolean extends_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_clause")) return false;
    if (!nextTokenIs(b, T_EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EXTENDS);
    r = r && type(b, l + 1);
    r = r && extends_clause_2(b, l + 1);
    exit_section_(b, m, EXTENDS_CLAUSE, r);
    return r;
  }

  // ( T_COMMA type )*
  private static boolean extends_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_clause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!extends_clause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "extends_clause_2", c)) break;
    }
    return true;
  }

  // T_COMMA type
  private static boolean extends_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( string | scoped_identifier_expression ) T_GT_ET expression
  public static boolean field_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_INITIALIZER, "<field initializer>");
    r = field_initializer_0(b, l + 1);
    r = r && consumeToken(b, T_GT_ET);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // string | scoped_identifier_expression
  private static boolean field_initializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_initializer_0")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = scoped_identifier_expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // T_QM? expression T_GT_ET type
  public static boolean field_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_SPECIFIER, "<field specifier>");
    r = field_specifier_0(b, l + 1);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, T_GT_ET);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // T_QM?
  private static boolean field_specifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_specifier_0")) return false;
    consumeToken(b, T_QM);
    return true;
  }

  /* ********************************************************** */
  // T_FINAL
  public static boolean final_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "final_modifier")) return false;
    if (!nextTokenIs(b, T_FINAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_FINAL);
    exit_section_(b, m, FINAL_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // T_FINALLY compound_statement
  public static boolean finally_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finally_clause")) return false;
    if (!nextTokenIs(b, T_FINALLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_FINALLY);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, FINALLY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // T_FOR T_LPAREN ( expression ( T_COMMA expression )* )? T_SEMICOLON ( expression ( T_COMMA expression )* )? T_SEMICOLON ( expression ( T_COMMA expression )* )? T_RPAREN statement
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, T_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_FOR, T_LPAREN);
    r = r && for_statement_2(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    r = r && for_statement_4(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    r = r && for_statement_6(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // ( expression ( T_COMMA expression )* )?
  private static boolean for_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2")) return false;
    for_statement_2_0(b, l + 1);
    return true;
  }

  // expression ( T_COMMA expression )*
  private static boolean for_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, -1);
    r = r && for_statement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA expression )*
  private static boolean for_statement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!for_statement_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_statement_2_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA expression
  private static boolean for_statement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( expression ( T_COMMA expression )* )?
  private static boolean for_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_4")) return false;
    for_statement_4_0(b, l + 1);
    return true;
  }

  // expression ( T_COMMA expression )*
  private static boolean for_statement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, -1);
    r = r && for_statement_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA expression )*
  private static boolean for_statement_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!for_statement_4_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_statement_4_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA expression
  private static boolean for_statement_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( expression ( T_COMMA expression )* )?
  private static boolean for_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_6")) return false;
    for_statement_6_0(b, l + 1);
    return true;
  }

  // expression ( T_COMMA expression )*
  private static boolean for_statement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, -1);
    r = r && for_statement_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA expression )*
  private static boolean for_statement_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_6_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!for_statement_6_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_statement_6_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA expression
  private static boolean for_statement_6_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_6_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_FOREACH T_LPAREN expression await_modifier? T_AS ( variablish_expression T_GT_ET )? variablish_expression T_RPAREN statement
  public static boolean foreach_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement")) return false;
    if (!nextTokenIs(b, T_FOREACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_FOREACH, T_LPAREN);
    r = r && expression(b, l + 1, -1);
    r = r && foreach_statement_3(b, l + 1);
    r = r && consumeToken(b, T_AS);
    r = r && foreach_statement_5(b, l + 1);
    r = r && expression(b, l + 1, 4);
    r = r && consumeToken(b, T_RPAREN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, FOREACH_STATEMENT, r);
    return r;
  }

  // await_modifier?
  private static boolean foreach_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_3")) return false;
    await_modifier(b, l + 1);
    return true;
  }

  // ( variablish_expression T_GT_ET )?
  private static boolean foreach_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_5")) return false;
    foreach_statement_5_0(b, l + 1);
    return true;
  }

  // variablish_expression T_GT_ET
  private static boolean foreach_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, 4);
    r = r && consumeToken(b, T_GT_ET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attribute_modifier? function_declaration_header ( compound_statement | T_SEMICOLON )
  public static boolean function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = function_declaration_0(b, l + 1);
    r = r && function_declaration_header(b, l + 1);
    r = r && function_declaration_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean function_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // compound_statement | T_SEMICOLON
  private static boolean function_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_2")) return false;
    boolean r;
    r = compound_statement(b, l + 1);
    if (!r) r = consumeToken(b, T_SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // async_modifier? T_FUNCTION identifier type_parameters? parameters capability_list? ( T_COLON attribute_modifier? type )? where_clause?
  static boolean function_declaration_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_header")) return false;
    if (!nextTokenIs(b, "", T_ASYNC, T_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_declaration_header_0(b, l + 1);
    r = r && consumeTokens(b, 0, T_FUNCTION, IDENTIFIER);
    r = r && function_declaration_header_3(b, l + 1);
    r = r && parameters(b, l + 1);
    r = r && function_declaration_header_5(b, l + 1);
    r = r && function_declaration_header_6(b, l + 1);
    r = r && function_declaration_header_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // async_modifier?
  private static boolean function_declaration_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_header_0")) return false;
    async_modifier(b, l + 1);
    return true;
  }

  // type_parameters?
  private static boolean function_declaration_header_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_header_3")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // capability_list?
  private static boolean function_declaration_header_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_header_5")) return false;
    capability_list(b, l + 1);
    return true;
  }

  // ( T_COLON attribute_modifier? type )?
  private static boolean function_declaration_header_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_header_6")) return false;
    function_declaration_header_6_0(b, l + 1);
    return true;
  }

  // T_COLON attribute_modifier? type
  private static boolean function_declaration_header_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_header_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    r = r && function_declaration_header_6_0_1(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attribute_modifier?
  private static boolean function_declaration_header_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_header_6_0_1")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // where_clause?
  private static boolean function_declaration_header_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_header_7")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type_modifier* T_LPAREN T_FUNCTION T_LPAREN ( inout_modifier? type variadic_modifier? ( T_COMMA inout_modifier? type variadic_modifier? )* T_COMMA? )? T_RPAREN capability_list? T_COLON type T_RPAREN
  public static boolean function_type_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_TYPE_SPECIFIER, "<function type specifier>");
    r = function_type_specifier_0(b, l + 1);
    r = r && consumeTokens(b, 0, T_LPAREN, T_FUNCTION, T_LPAREN);
    r = r && function_type_specifier_4(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    r = r && function_type_specifier_6(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_modifier*
  private static boolean function_type_specifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_type_specifier_0", c)) break;
    }
    return true;
  }

  // ( inout_modifier? type variadic_modifier? ( T_COMMA inout_modifier? type variadic_modifier? )* T_COMMA? )?
  private static boolean function_type_specifier_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_4")) return false;
    function_type_specifier_4_0(b, l + 1);
    return true;
  }

  // inout_modifier? type variadic_modifier? ( T_COMMA inout_modifier? type variadic_modifier? )* T_COMMA?
  private static boolean function_type_specifier_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_type_specifier_4_0_0(b, l + 1);
    r = r && type(b, l + 1);
    r = r && function_type_specifier_4_0_2(b, l + 1);
    r = r && function_type_specifier_4_0_3(b, l + 1);
    r = r && function_type_specifier_4_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // inout_modifier?
  private static boolean function_type_specifier_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_4_0_0")) return false;
    inout_modifier(b, l + 1);
    return true;
  }

  // variadic_modifier?
  private static boolean function_type_specifier_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_4_0_2")) return false;
    variadic_modifier(b, l + 1);
    return true;
  }

  // ( T_COMMA inout_modifier? type variadic_modifier? )*
  private static boolean function_type_specifier_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_4_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_type_specifier_4_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_type_specifier_4_0_3", c)) break;
    }
    return true;
  }

  // T_COMMA inout_modifier? type variadic_modifier?
  private static boolean function_type_specifier_4_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_4_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && function_type_specifier_4_0_3_0_1(b, l + 1);
    r = r && type(b, l + 1);
    r = r && function_type_specifier_4_0_3_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // inout_modifier?
  private static boolean function_type_specifier_4_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_4_0_3_0_1")) return false;
    inout_modifier(b, l + 1);
    return true;
  }

  // variadic_modifier?
  private static boolean function_type_specifier_4_0_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_4_0_3_0_3")) return false;
    variadic_modifier(b, l + 1);
    return true;
  }

  // T_COMMA?
  private static boolean function_type_specifier_4_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_4_0_4")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  // capability_list?
  private static boolean function_type_specifier_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_specifier_6")) return false;
    capability_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OPEN_TAG? statement*
  static boolean hackFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hackFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hackFile_0(b, l + 1);
    r = r && hackFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_TAG?
  private static boolean hackFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hackFile_0")) return false;
    consumeToken(b, OPEN_TAG);
    return true;
  }

  // statement*
  private static boolean hackFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hackFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "hackFile_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // T_IF parenthesized_expression statement ( ( T_ELSEIF | T_ELSE T_IF ) parenthesized_expression statement )* ( T_ELSE statement )?
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, T_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_IF);
    r = r && parenthesized_expression(b, l + 1);
    r = r && statement(b, l + 1);
    r = r && if_statement_3(b, l + 1);
    r = r && if_statement_4(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // ( ( T_ELSEIF | T_ELSE T_IF ) parenthesized_expression statement )*
  private static boolean if_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!if_statement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_3", c)) break;
    }
    return true;
  }

  // ( T_ELSEIF | T_ELSE T_IF ) parenthesized_expression statement
  private static boolean if_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_statement_3_0_0(b, l + 1);
    r = r && parenthesized_expression(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_ELSEIF | T_ELSE T_IF
  private static boolean if_statement_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ELSEIF);
    if (!r) r = parseTokens(b, 0, T_ELSE, T_IF);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_ELSE statement )?
  private static boolean if_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_4")) return false;
    if_statement_4_0(b, l + 1);
    return true;
  }

  // T_ELSE statement
  private static boolean if_statement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ELSE);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_IMPLEMENTS type ( T_COMMA type )*
  public static boolean implements_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_clause")) return false;
    if (!nextTokenIs(b, T_IMPLEMENTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_IMPLEMENTS);
    r = r && type(b, l + 1);
    r = r && implements_clause_2(b, l + 1);
    exit_section_(b, m, IMPLEMENTS_CLAUSE, r);
    return r;
  }

  // ( T_COMMA type )*
  private static boolean implements_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_clause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!implements_clause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "implements_clause_2", c)) break;
    }
    return true;
  }

  // T_COMMA type
  private static boolean implements_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_INOUT
  public static boolean inout_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inout_modifier")) return false;
    if (!nextTokenIs(b, T_INOUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_INOUT);
    exit_section_(b, m, INOUT_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // attribute_modifier? T_INTERFACE identifier type_parameters? extends_clause? where_clause? member_declarations
  public static boolean interface_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration")) return false;
    if (!nextTokenIs(b, "<interface declaration>", T_INTERFACE, T_LT_LT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_DECLARATION, "<interface declaration>");
    r = interface_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, T_INTERFACE, IDENTIFIER);
    r = r && interface_declaration_3(b, l + 1);
    r = r && interface_declaration_4(b, l + 1);
    r = r && interface_declaration_5(b, l + 1);
    r = r && member_declarations(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean interface_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // type_parameters?
  private static boolean interface_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_3")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // extends_clause?
  private static boolean interface_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_4")) return false;
    extends_clause(b, l + 1);
    return true;
  }

  // where_clause?
  private static boolean interface_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_5")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_TYPE
  // 	| T_NEWTYPE
  // 	| T_SHAPE
  // 	| T_TUPLE
  // 	| T_CLONE
  // 	| T_NEW
  // 	| T_PRINT
  // 	| T_NAMESPACE
  // 	| T_INCLUDE
  // 	| T_INCLUDE_ONCE
  // 	| T_REQUIRE
  // 	| T_REQUIRE_ONCE
  // 	| primitive_type
  // 	| collection_type
  static boolean keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword")) return false;
    boolean r;
    r = consumeToken(b, T_TYPE);
    if (!r) r = consumeToken(b, T_NEWTYPE);
    if (!r) r = consumeToken(b, T_SHAPE);
    if (!r) r = consumeToken(b, T_TUPLE);
    if (!r) r = consumeToken(b, T_CLONE);
    if (!r) r = consumeToken(b, T_NEW);
    if (!r) r = consumeToken(b, T_PRINT);
    if (!r) r = consumeToken(b, T_NAMESPACE);
    if (!r) r = consumeToken(b, T_INCLUDE);
    if (!r) r = consumeToken(b, T_INCLUDE_ONCE);
    if (!r) r = consumeToken(b, T_REQUIRE);
    if (!r) r = consumeToken(b, T_REQUIRE_ONCE);
    if (!r) r = primitive_type(b, l + 1);
    if (!r) r = collection_type(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // T_LBRACE ( class_const_declaration | method_declaration | property_declaration | type_const_declaration | context_const_declaration | trait_use_clause | require_implements_clause | require_extends_clause )* T_RBRACE
  public static boolean member_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declarations")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && member_declarations_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, MEMBER_DECLARATIONS, r);
    return r;
  }

  // ( class_const_declaration | method_declaration | property_declaration | type_const_declaration | context_const_declaration | trait_use_clause | require_implements_clause | require_extends_clause )*
  private static boolean member_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declarations_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member_declarations_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_declarations_1", c)) break;
    }
    return true;
  }

  // class_const_declaration | method_declaration | property_declaration | type_const_declaration | context_const_declaration | trait_use_clause | require_implements_clause | require_extends_clause
  private static boolean member_declarations_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declarations_1_0")) return false;
    boolean r;
    r = class_const_declaration(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = property_declaration(b, l + 1);
    if (!r) r = type_const_declaration(b, l + 1);
    if (!r) r = context_const_declaration(b, l + 1);
    if (!r) r = trait_use_clause(b, l + 1);
    if (!r) r = require_implements_clause(b, l + 1);
    if (!r) r = require_extends_clause(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // visibility_modifier
  // 	| static_modifier
  // 	| abstract_modifier
  // 	| final_modifier
  static boolean member_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_modifier")) return false;
    boolean r;
    r = visibility_modifier(b, l + 1);
    if (!r) r = static_modifier(b, l + 1);
    if (!r) r = abstract_modifier(b, l + 1);
    if (!r) r = final_modifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // attribute_modifier? member_modifier* function_declaration_header ( compound_statement | T_SEMICOLON )
  public static boolean method_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_DECLARATION, "<method declaration>");
    r = method_declaration_0(b, l + 1);
    r = r && method_declaration_1(b, l + 1);
    r = r && function_declaration_header(b, l + 1);
    r = r && method_declaration_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean method_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // member_modifier*
  private static boolean method_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_declaration_1", c)) break;
    }
    return true;
  }

  // compound_statement | T_SEMICOLON
  private static boolean method_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_3")) return false;
    boolean r;
    r = compound_statement(b, l + 1);
    if (!r) r = consumeToken(b, T_SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // T_LT_LT identifier T_COLON qualified_identifier_expression arguments? ( T_COMMA qualified_identifier_expression arguments? )* T_COMMA? T_GT_GT
  public static boolean module_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_attribute")) return false;
    if (!nextTokenIs(b, T_LT_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_LT_LT, IDENTIFIER, T_COLON);
    r = r && qualified_identifier_expression(b, l + 1);
    r = r && module_attribute_4(b, l + 1);
    r = r && module_attribute_5(b, l + 1);
    r = r && module_attribute_6(b, l + 1);
    r = r && consumeToken(b, T_GT_GT);
    exit_section_(b, m, MODULE_ATTRIBUTE, r);
    return r;
  }

  // arguments?
  private static boolean module_attribute_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_attribute_4")) return false;
    arguments(b, l + 1);
    return true;
  }

  // ( T_COMMA qualified_identifier_expression arguments? )*
  private static boolean module_attribute_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_attribute_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!module_attribute_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_attribute_5", c)) break;
    }
    return true;
  }

  // T_COMMA qualified_identifier_expression arguments?
  private static boolean module_attribute_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_attribute_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && qualified_identifier_expression(b, l + 1);
    r = r && module_attribute_5_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arguments?
  private static boolean module_attribute_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_attribute_5_0_2")) return false;
    arguments(b, l + 1);
    return true;
  }

  // T_COMMA?
  private static boolean module_attribute_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_attribute_6")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_NAMESPACE ( qualified_identifier_expression T_SEMICOLON | qualified_identifier_expression? compound_statement )?
  public static boolean namespace_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration")) return false;
    if (!nextTokenIs(b, T_NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NAMESPACE);
    r = r && namespace_declaration_1(b, l + 1);
    exit_section_(b, m, NAMESPACE_DECLARATION, r);
    return r;
  }

  // ( qualified_identifier_expression T_SEMICOLON | qualified_identifier_expression? compound_statement )?
  private static boolean namespace_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration_1")) return false;
    namespace_declaration_1_0(b, l + 1);
    return true;
  }

  // qualified_identifier_expression T_SEMICOLON | qualified_identifier_expression? compound_statement
  private static boolean namespace_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_declaration_1_0_0(b, l + 1);
    if (!r) r = namespace_declaration_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // qualified_identifier_expression T_SEMICOLON
  private static boolean namespace_declaration_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualified_identifier_expression(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // qualified_identifier_expression? compound_statement
  private static boolean namespace_declaration_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_declaration_1_0_1_0(b, l + 1);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // qualified_identifier_expression?
  private static boolean namespace_declaration_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration_1_0_1_0")) return false;
    qualified_identifier_expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // qualified_identifier_expression T_BACKSLASH?
  // 	| T_BACKSLASH
  static boolean namespace_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_identifier")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_identifier_0(b, l + 1);
    if (!r) r = consumeToken(b, T_BACKSLASH);
    exit_section_(b, m, null, r);
    return r;
  }

  // qualified_identifier_expression T_BACKSLASH?
  private static boolean namespace_identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_identifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualified_identifier_expression(b, l + 1);
    r = r && namespace_identifier_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_BACKSLASH?
  private static boolean namespace_identifier_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_identifier_0_1")) return false;
    consumeToken(b, T_BACKSLASH);
    return true;
  }

  /* ********************************************************** */
  // attribute_modifier? visibility_modifier? inout_modifier? type? variadic_modifier? variable_expression ( T_EQ expression )?
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = parameter_0(b, l + 1);
    r = r && parameter_1(b, l + 1);
    r = r && parameter_2(b, l + 1);
    r = r && parameter_3(b, l + 1);
    r = r && parameter_4(b, l + 1);
    r = r && variable_expression(b, l + 1);
    r = r && parameter_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // visibility_modifier?
  private static boolean parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1")) return false;
    visibility_modifier(b, l + 1);
    return true;
  }

  // inout_modifier?
  private static boolean parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2")) return false;
    inout_modifier(b, l + 1);
    return true;
  }

  // type?
  private static boolean parameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_3")) return false;
    type(b, l + 1);
    return true;
  }

  // variadic_modifier?
  private static boolean parameter_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_4")) return false;
    variadic_modifier(b, l + 1);
    return true;
  }

  // ( T_EQ expression )?
  private static boolean parameter_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_6")) return false;
    parameter_6_0(b, l + 1);
    return true;
  }

  // T_EQ expression
  private static boolean parameter_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQ);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_LPAREN ( variadic_modifier | parameter ( T_COMMA parameter )* T_COMMA? )? T_RPAREN
  public static boolean parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && parameters_1(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, PARAMETERS, r);
    return r;
  }

  // ( variadic_modifier | parameter ( T_COMMA parameter )* T_COMMA? )?
  private static boolean parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1")) return false;
    parameters_1_0(b, l + 1);
    return true;
  }

  // variadic_modifier | parameter ( T_COMMA parameter )* T_COMMA?
  private static boolean parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variadic_modifier(b, l + 1);
    if (!r) r = parameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // parameter ( T_COMMA parameter )* T_COMMA?
  private static boolean parameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter(b, l + 1);
    r = r && parameters_1_0_1_1(b, l + 1);
    r = r && parameters_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA parameter )*
  private static boolean parameters_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameters_1_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameters_1_0_1_1", c)) break;
    }
    return true;
  }

  // T_COMMA parameter
  private static boolean parameters_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean parameters_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_1_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_BOOL
  // 	| T_FLOAT
  // 	| T_INT
  // 	| T_NUM
  // 	| T_STRING
  // 	| T_ARRAYKEY
  // 	| T_VOID
  // 	| T_NONNULL
  // 	| T_NULL
  // 	| T_MIXED
  // 	| T_DYNAMIC
  // 	| T_NORETURN
  // 	| T_NOTHING
  // 	| T_RESOURCE
  static boolean primitive_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type")) return false;
    boolean r;
    r = consumeToken(b, T_BOOL);
    if (!r) r = consumeToken(b, T_FLOAT);
    if (!r) r = consumeToken(b, T_INT);
    if (!r) r = consumeToken(b, T_NUM);
    if (!r) r = consumeToken(b, T_STRING);
    if (!r) r = consumeToken(b, T_ARRAYKEY);
    if (!r) r = consumeToken(b, T_VOID);
    if (!r) r = consumeToken(b, T_NONNULL);
    if (!r) r = consumeToken(b, T_NULL);
    if (!r) r = consumeToken(b, T_MIXED);
    if (!r) r = consumeToken(b, T_DYNAMIC);
    if (!r) r = consumeToken(b, T_NORETURN);
    if (!r) r = consumeToken(b, T_NOTHING);
    if (!r) r = consumeToken(b, T_RESOURCE);
    return r;
  }

  /* ********************************************************** */
  // attribute_modifier? member_modifier* type? property_declarator ( T_COMMA property_declarator )* T_SEMICOLON
  public static boolean property_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_DECLARATION, "<property declaration>");
    r = property_declaration_0(b, l + 1);
    r = r && property_declaration_1(b, l + 1);
    r = r && property_declaration_2(b, l + 1);
    r = r && property_declarator(b, l + 1);
    r = r && property_declaration_4(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean property_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // member_modifier*
  private static boolean property_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "property_declaration_1", c)) break;
    }
    return true;
  }

  // type?
  private static boolean property_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_2")) return false;
    type(b, l + 1);
    return true;
  }

  // ( T_COMMA property_declarator )*
  private static boolean property_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!property_declaration_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "property_declaration_4", c)) break;
    }
    return true;
  }

  // T_COMMA property_declarator
  private static boolean property_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && property_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable_expression ( T_EQ expression )?
  public static boolean property_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declarator")) return false;
    if (!nextTokenIs(b, T_DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_expression(b, l + 1);
    r = r && property_declarator_1(b, l + 1);
    exit_section_(b, m, PROPERTY_DECLARATOR, r);
    return r;
  }

  // ( T_EQ expression )?
  private static boolean property_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declarator_1")) return false;
    property_declarator_1_0(b, l + 1);
    return true;
  }

  // T_EQ expression
  private static boolean property_declarator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declarator_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQ);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_REQUIRE T_EXTENDS type ( T_COMMA type )* T_SEMICOLON
  public static boolean require_extends_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_extends_clause")) return false;
    if (!nextTokenIs(b, T_REQUIRE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_REQUIRE, T_EXTENDS);
    r = r && type(b, l + 1);
    r = r && require_extends_clause_3(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, REQUIRE_EXTENDS_CLAUSE, r);
    return r;
  }

  // ( T_COMMA type )*
  private static boolean require_extends_clause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_extends_clause_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!require_extends_clause_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "require_extends_clause_3", c)) break;
    }
    return true;
  }

  // T_COMMA type
  private static boolean require_extends_clause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_extends_clause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_REQUIRE T_IMPLEMENTS type ( T_COMMA type )* T_SEMICOLON
  public static boolean require_implements_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_implements_clause")) return false;
    if (!nextTokenIs(b, T_REQUIRE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_REQUIRE, T_IMPLEMENTS);
    r = r && type(b, l + 1);
    r = r && require_implements_clause_3(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, REQUIRE_IMPLEMENTS_CLAUSE, r);
    return r;
  }

  // ( T_COMMA type )*
  private static boolean require_implements_clause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_implements_clause_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!require_implements_clause_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "require_implements_clause_3", c)) break;
    }
    return true;
  }

  // T_COMMA type
  private static boolean require_implements_clause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_implements_clause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_RETURN expression? T_SEMICOLON
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, T_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_RETURN);
    r = r && return_statement_1(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // expression?
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    expression(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // type_modifier* T_SHAPE T_LPAREN ( ( field_specifier | T_THREE_DOTS ) ( T_COMMA ( field_specifier | T_THREE_DOTS ) )* T_COMMA? )? T_RPAREN
  public static boolean shape_type_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_type_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHAPE_TYPE_SPECIFIER, "<shape type specifier>");
    r = shape_type_specifier_0(b, l + 1);
    r = r && consumeTokens(b, 0, T_SHAPE, T_LPAREN);
    r = r && shape_type_specifier_3(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_modifier*
  private static boolean shape_type_specifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_type_specifier_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shape_type_specifier_0", c)) break;
    }
    return true;
  }

  // ( ( field_specifier | T_THREE_DOTS ) ( T_COMMA ( field_specifier | T_THREE_DOTS ) )* T_COMMA? )?
  private static boolean shape_type_specifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_type_specifier_3")) return false;
    shape_type_specifier_3_0(b, l + 1);
    return true;
  }

  // ( field_specifier | T_THREE_DOTS ) ( T_COMMA ( field_specifier | T_THREE_DOTS ) )* T_COMMA?
  private static boolean shape_type_specifier_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_type_specifier_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shape_type_specifier_3_0_0(b, l + 1);
    r = r && shape_type_specifier_3_0_1(b, l + 1);
    r = r && shape_type_specifier_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // field_specifier | T_THREE_DOTS
  private static boolean shape_type_specifier_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_type_specifier_3_0_0")) return false;
    boolean r;
    r = field_specifier(b, l + 1);
    if (!r) r = consumeToken(b, T_THREE_DOTS);
    return r;
  }

  // ( T_COMMA ( field_specifier | T_THREE_DOTS ) )*
  private static boolean shape_type_specifier_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_type_specifier_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!shape_type_specifier_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shape_type_specifier_3_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA ( field_specifier | T_THREE_DOTS )
  private static boolean shape_type_specifier_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_type_specifier_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && shape_type_specifier_3_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // field_specifier | T_THREE_DOTS
  private static boolean shape_type_specifier_3_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_type_specifier_3_0_1_0_1")) return false;
    boolean r;
    r = field_specifier(b, l + 1);
    if (!r) r = consumeToken(b, T_THREE_DOTS);
    return r;
  }

  // T_COMMA?
  private static boolean shape_type_specifier_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_type_specifier_3_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // variable_expression
  static boolean single_parameter(PsiBuilder b, int l) {
    return variable_expression(b, l + 1);
  }

  /* ********************************************************** */
  // single_parameter
  static boolean single_parameter_parameters(PsiBuilder b, int l) {
    return single_parameter(b, l + 1);
  }

  /* ********************************************************** */
  // declaration
  // 	| module_attribute
  // 	| compound_statement
  // 	| empty_statement
  // 	| expression_statement
  // 	| return_statement
  // 	| break_statement
  // 	| continue_statement
  // 	| throw_statement
  // 	| echo_statement
  // 	| unset_statement
  // 	| use_statement
  // 	| if_statement
  // 	| while_statement
  // 	| do_statement
  // 	| for_statement
  // 	| switch_statement
  // 	| foreach_statement
  // 	| try_statement
  // 	| concurrent_statement
  // 	| using_statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, STATEMENT, "<statement>");
    r = declaration(b, l + 1);
    if (!r) r = module_attribute(b, l + 1);
    if (!r) r = compound_statement(b, l + 1);
    if (!r) r = empty_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = break_statement(b, l + 1);
    if (!r) r = continue_statement(b, l + 1);
    if (!r) r = throw_statement(b, l + 1);
    if (!r) r = echo_statement(b, l + 1);
    if (!r) r = unset_statement(b, l + 1);
    if (!r) r = use_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = do_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = switch_statement(b, l + 1);
    if (!r) r = foreach_statement(b, l + 1);
    if (!r) r = try_statement(b, l + 1);
    if (!r) r = concurrent_statement(b, l + 1);
    if (!r) r = using_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_STATIC
  public static boolean static_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_modifier")) return false;
    if (!nextTokenIs(b, T_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_STATIC);
    exit_section_(b, m, STATIC_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // T_CASE expression T_COLON statement*
  public static boolean switch_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case")) return false;
    if (!nextTokenIs(b, T_CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CASE);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, T_COLON);
    r = r && switch_case_3(b, l + 1);
    exit_section_(b, m, SWITCH_CASE, r);
    return r;
  }

  // statement*
  private static boolean switch_case_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_case_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // T_DEFAULT T_COLON statement*
  public static boolean switch_default(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_default")) return false;
    if (!nextTokenIs(b, T_DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_DEFAULT, T_COLON);
    r = r && switch_default_2(b, l + 1);
    exit_section_(b, m, SWITCH_DEFAULT, r);
    return r;
  }

  // statement*
  private static boolean switch_default_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_default_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_default_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // T_SWITCH parenthesized_expression T_LBRACE ( switch_case | switch_default )* T_RBRACE
  public static boolean switch_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement")) return false;
    if (!nextTokenIs(b, T_SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SWITCH);
    r = r && parenthesized_expression(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && switch_statement_3(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, SWITCH_STATEMENT, r);
    return r;
  }

  // ( switch_case | switch_default )*
  private static boolean switch_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!switch_statement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_statement_3", c)) break;
    }
    return true;
  }

  // switch_case | switch_default
  private static boolean switch_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement_3_0")) return false;
    boolean r;
    r = switch_case(b, l + 1);
    if (!r) r = switch_default(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // T_THROW expression T_SEMICOLON
  public static boolean throw_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throw_statement")) return false;
    if (!nextTokenIs(b, T_THROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_THROW);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, THROW_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // identifier T_AS ( visibility_modifier identifier? | visibility_modifier? identifier )
  public static boolean trait_alias_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_clause")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, T_AS);
    r = r && trait_alias_clause_2(b, l + 1);
    exit_section_(b, m, TRAIT_ALIAS_CLAUSE, r);
    return r;
  }

  // visibility_modifier identifier? | visibility_modifier? identifier
  private static boolean trait_alias_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_clause_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trait_alias_clause_2_0(b, l + 1);
    if (!r) r = trait_alias_clause_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // visibility_modifier identifier?
  private static boolean trait_alias_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = visibility_modifier(b, l + 1);
    r = r && trait_alias_clause_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier?
  private static boolean trait_alias_clause_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_clause_2_0_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // visibility_modifier? identifier
  private static boolean trait_alias_clause_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_clause_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trait_alias_clause_2_1_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // visibility_modifier?
  private static boolean trait_alias_clause_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_clause_2_1_0")) return false;
    visibility_modifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attribute_modifier? T_TRAIT identifier type_parameters? implements_clause? where_clause? member_declarations
  public static boolean trait_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_declaration")) return false;
    if (!nextTokenIs(b, "<trait declaration>", T_LT_LT, T_TRAIT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRAIT_DECLARATION, "<trait declaration>");
    r = trait_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, T_TRAIT, IDENTIFIER);
    r = r && trait_declaration_3(b, l + 1);
    r = r && trait_declaration_4(b, l + 1);
    r = r && trait_declaration_5(b, l + 1);
    r = r && member_declarations(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean trait_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // type_parameters?
  private static boolean trait_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_declaration_3")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // implements_clause?
  private static boolean trait_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_declaration_4")) return false;
    implements_clause(b, l + 1);
    return true;
  }

  // where_clause?
  private static boolean trait_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_declaration_5")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // qualified_identifier_expression '::' identifier T_INSTEADOF qualified_identifier_expression ( T_COMMA qualified_identifier_expression )*
  public static boolean trait_select_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_select_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRAIT_SELECT_CLAUSE, "<trait select clause>");
    r = qualified_identifier_expression(b, l + 1);
    r = r && consumeToken(b, "::");
    r = r && consumeTokens(b, 0, IDENTIFIER, T_INSTEADOF);
    r = r && qualified_identifier_expression(b, l + 1);
    r = r && trait_select_clause_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( T_COMMA qualified_identifier_expression )*
  private static boolean trait_select_clause_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_select_clause_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!trait_select_clause_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_select_clause_5", c)) break;
    }
    return true;
  }

  // T_COMMA qualified_identifier_expression
  private static boolean trait_select_clause_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_select_clause_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && qualified_identifier_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_USE type ( T_COMMA type )* ( T_LBRACE ( ( trait_select_clause | trait_alias_clause ) T_SEMICOLON )* T_RBRACE | T_SEMICOLON )
  public static boolean trait_use_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_clause")) return false;
    if (!nextTokenIs(b, T_USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_USE);
    r = r && type(b, l + 1);
    r = r && trait_use_clause_2(b, l + 1);
    r = r && trait_use_clause_3(b, l + 1);
    exit_section_(b, m, TRAIT_USE_CLAUSE, r);
    return r;
  }

  // ( T_COMMA type )*
  private static boolean trait_use_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_clause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!trait_use_clause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_use_clause_2", c)) break;
    }
    return true;
  }

  // T_COMMA type
  private static boolean trait_use_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_LBRACE ( ( trait_select_clause | trait_alias_clause ) T_SEMICOLON )* T_RBRACE | T_SEMICOLON
  private static boolean trait_use_clause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_clause_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trait_use_clause_3_0(b, l + 1);
    if (!r) r = consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_LBRACE ( ( trait_select_clause | trait_alias_clause ) T_SEMICOLON )* T_RBRACE
  private static boolean trait_use_clause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_clause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && trait_use_clause_3_0_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( trait_select_clause | trait_alias_clause ) T_SEMICOLON )*
  private static boolean trait_use_clause_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_clause_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!trait_use_clause_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_use_clause_3_0_1", c)) break;
    }
    return true;
  }

  // ( trait_select_clause | trait_alias_clause ) T_SEMICOLON
  private static boolean trait_use_clause_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_clause_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trait_use_clause_3_0_1_0_0(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // trait_select_clause | trait_alias_clause
  private static boolean trait_use_clause_3_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_clause_3_0_1_0_0")) return false;
    boolean r;
    r = trait_select_clause(b, l + 1);
    if (!r) r = trait_alias_clause(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // T_TRY compound_statement catch_clause* ( catch_clause | finally_clause )
  public static boolean try_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement")) return false;
    if (!nextTokenIs(b, T_TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_TRY);
    r = r && compound_statement(b, l + 1);
    r = r && try_statement_2(b, l + 1);
    r = r && try_statement_3(b, l + 1);
    exit_section_(b, m, TRY_STATEMENT, r);
    return r;
  }

  // catch_clause*
  private static boolean try_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!catch_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "try_statement_2", c)) break;
    }
    return true;
  }

  // catch_clause | finally_clause
  private static boolean try_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_3")) return false;
    boolean r;
    r = catch_clause(b, l + 1);
    if (!r) r = finally_clause(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // type_modifier* T_LPAREN type ( T_COMMA type )* T_COMMA? T_RPAREN
  public static boolean tuple_type_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_TYPE_SPECIFIER, "<tuple type specifier>");
    r = tuple_type_specifier_0(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    r = r && type(b, l + 1);
    r = r && tuple_type_specifier_3(b, l + 1);
    r = r && tuple_type_specifier_4(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_modifier*
  private static boolean tuple_type_specifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_specifier_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_type_specifier_0", c)) break;
    }
    return true;
  }

  // ( T_COMMA type )*
  private static boolean tuple_type_specifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_specifier_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuple_type_specifier_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_type_specifier_3", c)) break;
    }
    return true;
  }

  // T_COMMA type
  private static boolean tuple_type_specifier_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_specifier_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean tuple_type_specifier_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_specifier_4")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // type_specifier
  // 	| type_constant
  // 	| shape_type_specifier
  // 	| function_type_specifier
  // 	| tuple_type_specifier
  static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    r = type_specifier(b, l + 1);
    if (!r) r = type_constant(b, l + 1);
    if (!r) r = shape_type_specifier(b, l + 1);
    if (!r) r = function_type_specifier(b, l + 1);
    if (!r) r = tuple_type_specifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // T_LT ( type ( T_COMMA type )* T_COMMA? )? T_GT
  public static boolean type_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments")) return false;
    if (!nextTokenIs(b, T_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LT);
    r = r && type_arguments_1(b, l + 1);
    r = r && consumeToken(b, T_GT);
    exit_section_(b, m, TYPE_ARGUMENTS, r);
    return r;
  }

  // ( type ( T_COMMA type )* T_COMMA? )?
  private static boolean type_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_1")) return false;
    type_arguments_1_0(b, l + 1);
    return true;
  }

  // type ( T_COMMA type )* T_COMMA?
  private static boolean type_arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && type_arguments_1_0_1(b, l + 1);
    r = r && type_arguments_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA type )*
  private static boolean type_arguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_arguments_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_arguments_1_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA type
  private static boolean type_arguments_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean type_arguments_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_1_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // attribute_modifier? member_modifier* T_CONST T_TYPE identifier type_parameters? ( T_AS type )? ( T_EQ type )? T_SEMICOLON
  public static boolean type_const_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_const_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CONST_DECLARATION, "<type const declaration>");
    r = type_const_declaration_0(b, l + 1);
    r = r && type_const_declaration_1(b, l + 1);
    r = r && consumeTokens(b, 0, T_CONST, T_TYPE, IDENTIFIER);
    r = r && type_const_declaration_5(b, l + 1);
    r = r && type_const_declaration_6(b, l + 1);
    r = r && type_const_declaration_7(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean type_const_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_const_declaration_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // member_modifier*
  private static boolean type_const_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_const_declaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_const_declaration_1", c)) break;
    }
    return true;
  }

  // type_parameters?
  private static boolean type_const_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_const_declaration_5")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // ( T_AS type )?
  private static boolean type_const_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_const_declaration_6")) return false;
    type_const_declaration_6_0(b, l + 1);
    return true;
  }

  // T_AS type
  private static boolean type_const_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_const_declaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_EQ type )?
  private static boolean type_const_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_const_declaration_7")) return false;
    type_const_declaration_7_0(b, l + 1);
    return true;
  }

  // T_EQ type
  private static boolean type_const_declaration_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_const_declaration_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQ);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_modifier+
  public static boolean type_constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CONSTANT, "<type constant>");
    r = type_modifier(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!type_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_constant", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@'
  // 	| T_QM
  // 	| '~'
  static boolean type_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_modifier")) return false;
    boolean r;
    r = consumeToken(b, "@");
    if (!r) r = consumeToken(b, T_QM);
    if (!r) r = consumeToken(b, "~");
    return r;
  }

  /* ********************************************************** */
  // attribute_modifier? ( T_PLUS | T_MINUS | T_REIFY )? identifier ( ( T_AS | T_SUPER ) type )*
  public static boolean type_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_PARAMETER, "<type parameter>");
    r = type_parameter_0(b, l + 1);
    r = r && type_parameter_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && type_parameter_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean type_parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // ( T_PLUS | T_MINUS | T_REIFY )?
  private static boolean type_parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_1")) return false;
    type_parameter_1_0(b, l + 1);
    return true;
  }

  // T_PLUS | T_MINUS | T_REIFY
  private static boolean type_parameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_1_0")) return false;
    boolean r;
    r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    if (!r) r = consumeToken(b, T_REIFY);
    return r;
  }

  // ( ( T_AS | T_SUPER ) type )*
  private static boolean type_parameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_parameter_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_parameter_3", c)) break;
    }
    return true;
  }

  // ( T_AS | T_SUPER ) type
  private static boolean type_parameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_parameter_3_0_0(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_AS | T_SUPER
  private static boolean type_parameter_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_3_0_0")) return false;
    boolean r;
    r = consumeToken(b, T_AS);
    if (!r) r = consumeToken(b, T_SUPER);
    return r;
  }

  /* ********************************************************** */
  // T_LT type_parameter ( T_COMMA type_parameter )* T_COMMA? T_GT
  public static boolean type_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters")) return false;
    if (!nextTokenIs(b, T_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LT);
    r = r && type_parameter(b, l + 1);
    r = r && type_parameters_2(b, l + 1);
    r = r && type_parameters_3(b, l + 1);
    r = r && consumeToken(b, T_GT);
    exit_section_(b, m, TYPE_PARAMETERS, r);
    return r;
  }

  // ( T_COMMA type_parameter )*
  private static boolean type_parameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_parameters_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_parameters_2", c)) break;
    }
    return true;
  }

  // T_COMMA type_parameter
  private static boolean type_parameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && type_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean type_parameters_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_3")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // type_modifier* ( primitive_type | qualified_identifier_expression | collection_type ) type_arguments?
  public static boolean type_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPECIFIER, "<type specifier>");
    r = type_specifier_0(b, l + 1);
    r = r && type_specifier_1(b, l + 1);
    r = r && type_specifier_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_modifier*
  private static boolean type_specifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specifier_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_specifier_0", c)) break;
    }
    return true;
  }

  // primitive_type | qualified_identifier_expression | collection_type
  private static boolean type_specifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specifier_1")) return false;
    boolean r;
    r = primitive_type(b, l + 1);
    if (!r) r = qualified_identifier_expression(b, l + 1);
    if (!r) r = collection_type(b, l + 1);
    return r;
  }

  // type_arguments?
  private static boolean type_specifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specifier_2")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type enumerator
  public static boolean typed_enumerator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typed_enumerator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPED_ENUMERATOR, "<typed enumerator>");
    r = type(b, l + 1);
    r = r && enumerator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_UNSET T_LPAREN ( variablish_expression ( T_COMMA variablish_expression )* )? T_RPAREN T_SEMICOLON
  public static boolean unset_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unset_statement")) return false;
    if (!nextTokenIs(b, T_UNSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_UNSET, T_LPAREN);
    r = r && unset_statement_2(b, l + 1);
    r = r && consumeTokens(b, 0, T_RPAREN, T_SEMICOLON);
    exit_section_(b, m, UNSET_STATEMENT, r);
    return r;
  }

  // ( variablish_expression ( T_COMMA variablish_expression )* )?
  private static boolean unset_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unset_statement_2")) return false;
    unset_statement_2_0(b, l + 1);
    return true;
  }

  // variablish_expression ( T_COMMA variablish_expression )*
  private static boolean unset_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unset_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, 4);
    r = r && unset_statement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA variablish_expression )*
  private static boolean unset_statement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unset_statement_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!unset_statement_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unset_statement_2_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA variablish_expression
  private static boolean unset_statement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unset_statement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && expression(b, l + 1, 4);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // use_type? namespace_identifier ( T_AS identifier )?
  public static boolean use_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USE_CLAUSE, "<use clause>");
    r = use_clause_0(b, l + 1);
    r = r && namespace_identifier(b, l + 1);
    r = r && use_clause_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // use_type?
  private static boolean use_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause_0")) return false;
    use_type(b, l + 1);
    return true;
  }

  // ( T_AS identifier )?
  private static boolean use_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause_2")) return false;
    use_clause_2_0(b, l + 1);
    return true;
  }

  // T_AS identifier
  private static boolean use_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_USE ( use_clause ( T_COMMA use_clause )* T_COMMA? | use_type? namespace_identifier T_LBRACE use_clause ( T_COMMA use_clause )* T_COMMA? T_RBRACE ) T_SEMICOLON
  public static boolean use_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement")) return false;
    if (!nextTokenIs(b, T_USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_USE);
    r = r && use_statement_1(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, USE_STATEMENT, r);
    return r;
  }

  // use_clause ( T_COMMA use_clause )* T_COMMA? | use_type? namespace_identifier T_LBRACE use_clause ( T_COMMA use_clause )* T_COMMA? T_RBRACE
  private static boolean use_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_statement_1_0(b, l + 1);
    if (!r) r = use_statement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // use_clause ( T_COMMA use_clause )* T_COMMA?
  private static boolean use_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_clause(b, l + 1);
    r = r && use_statement_1_0_1(b, l + 1);
    r = r && use_statement_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA use_clause )*
  private static boolean use_statement_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_statement_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_statement_1_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA use_clause
  private static boolean use_statement_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && use_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean use_statement_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  // use_type? namespace_identifier T_LBRACE use_clause ( T_COMMA use_clause )* T_COMMA? T_RBRACE
  private static boolean use_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_statement_1_1_0(b, l + 1);
    r = r && namespace_identifier(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && use_clause(b, l + 1);
    r = r && use_statement_1_1_4(b, l + 1);
    r = r && use_statement_1_1_5(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // use_type?
  private static boolean use_statement_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1_1_0")) return false;
    use_type(b, l + 1);
    return true;
  }

  // ( T_COMMA use_clause )*
  private static boolean use_statement_1_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1_1_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_statement_1_1_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_statement_1_1_4", c)) break;
    }
    return true;
  }

  // T_COMMA use_clause
  private static boolean use_statement_1_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && use_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean use_statement_1_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1_1_5")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_NAMESPACE
  // 	| T_FUNCTION
  // 	| T_TYPE
  // 	| T_CONST
  public static boolean use_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USE_TYPE, "<use type>");
    r = consumeToken(b, T_NAMESPACE);
    if (!r) r = consumeToken(b, T_FUNCTION);
    if (!r) r = consumeToken(b, T_TYPE);
    if (!r) r = consumeToken(b, T_CONST);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // await_modifier? T_USING ( expression_statement | T_LPAREN expression ( T_COMMA expression )* T_RPAREN ( compound_statement | T_SEMICOLON ) )
  public static boolean using_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement")) return false;
    if (!nextTokenIs(b, "<using statement>", T_AWAIT, T_USING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USING_STATEMENT, "<using statement>");
    r = using_statement_0(b, l + 1);
    r = r && consumeToken(b, T_USING);
    r = r && using_statement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // await_modifier?
  private static boolean using_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement_0")) return false;
    await_modifier(b, l + 1);
    return true;
  }

  // expression_statement | T_LPAREN expression ( T_COMMA expression )* T_RPAREN ( compound_statement | T_SEMICOLON )
  private static boolean using_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_statement(b, l + 1);
    if (!r) r = using_statement_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_LPAREN expression ( T_COMMA expression )* T_RPAREN ( compound_statement | T_SEMICOLON )
  private static boolean using_statement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && expression(b, l + 1, -1);
    r = r && using_statement_2_1_2(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    r = r && using_statement_2_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA expression )*
  private static boolean using_statement_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!using_statement_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "using_statement_2_1_2", c)) break;
    }
    return true;
  }

  // T_COMMA expression
  private static boolean using_statement_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // compound_statement | T_SEMICOLON
  private static boolean using_statement_2_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement_2_1_4")) return false;
    boolean r;
    r = compound_statement(b, l + 1);
    if (!r) r = consumeToken(b, T_SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // T_THREE_DOTS
  public static boolean variadic_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variadic_modifier")) return false;
    if (!nextTokenIs(b, T_THREE_DOTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_THREE_DOTS);
    exit_section_(b, m, VARIADIC_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // T_PUBLIC
  // 	| T_PROTECTED
  // 	| T_PRIVATE
  // 	| T_INTERNAL
  public static boolean visibility_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VISIBILITY_MODIFIER, "<visibility modifier>");
    r = consumeToken(b, T_PUBLIC);
    if (!r) r = consumeToken(b, T_PROTECTED);
    if (!r) r = consumeToken(b, T_PRIVATE);
    if (!r) r = consumeToken(b, T_INTERNAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_WHERE ( where_constraint T_COMMA? )+
  public static boolean where_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause")) return false;
    if (!nextTokenIs(b, T_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_WHERE);
    r = r && where_clause_1(b, l + 1);
    exit_section_(b, m, WHERE_CLAUSE, r);
    return r;
  }

  // ( where_constraint T_COMMA? )+
  private static boolean where_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = where_clause_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!where_clause_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "where_clause_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // where_constraint T_COMMA?
  private static boolean where_clause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = where_constraint(b, l + 1);
    r = r && where_clause_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean where_clause_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause_1_0_1")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // type ( T_AS | T_SUPER | T_EQ ) type
  public static boolean where_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHERE_CONSTRAINT, "<where constraint>");
    r = type(b, l + 1);
    r = r && where_constraint_1(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // T_AS | T_SUPER | T_EQ
  private static boolean where_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_constraint_1")) return false;
    boolean r;
    r = consumeToken(b, T_AS);
    if (!r) r = consumeToken(b, T_SUPER);
    if (!r) r = consumeToken(b, T_EQ);
    return r;
  }

  /* ********************************************************** */
  // T_WHILE parenthesized_expression statement
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, T_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_WHILE);
    r = r && parenthesized_expression(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expression
  // Operator priority table:
  // 0: ATOM(array_expression)
  // 1: ATOM(tuple_expression)
  // 2: ATOM(shape_expression)
  // 3: POSTFIX(collection_expression)
  // 4: ATOM(literal_expression)
  // 5: ATOM(variable_expression) ATOM(pipe_variable_expression) ATOM(list_expression) POSTFIX(subscript_expression)
  //    ATOM(qualified_identifier_expression) PREFIX(parenthesized_expression) ATOM(collection_call_expression) POSTFIX(expression_call_expression)
  //    ATOM(scoped_identifier_expression) ATOM(scope_identifier_expression) POSTFIX(selection_expression)
  // 6: ATOM(expression_tree_expression)
  // 7: ATOM(prefixed_string_expression)
  // 8: BINARY(binary_expression)
  // 9: ATOM(prefix_unary_expression)
  // 10: POSTFIX(postfix_unary_expression)
  // 11: POSTFIX(is_expression)
  // 12: POSTFIX(as_expression)
  // 13: ATOM(awaitable_expression)
  // 14: ATOM(yield_expression)
  // 15: PREFIX(cast_expression)
  // 16: BINARY(ternary_expression)
  // 17: ATOM(lambda_expression)
  // 18: PREFIX(new_expression)
  // 19: PREFIX(include_expression)
  // 20: PREFIX(require_expression)
  // 21: ATOM(anonymous_function_expression)
  // 22: ATOM(function_pointer_expression)
  // 23: ATOM(enum_class_label_expression)
  public static boolean expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = array_expression(b, l + 1);
    if (!r) r = tuple_expression(b, l + 1);
    if (!r) r = shape_expression(b, l + 1);
    if (!r) r = literal_expression(b, l + 1);
    if (!r) r = variable_expression(b, l + 1);
    if (!r) r = pipe_variable_expression(b, l + 1);
    if (!r) r = list_expression(b, l + 1);
    if (!r) r = qualified_identifier_expression(b, l + 1);
    if (!r) r = parenthesized_expression(b, l + 1);
    if (!r) r = collection_call_expression(b, l + 1);
    if (!r) r = scoped_identifier_expression(b, l + 1);
    if (!r) r = scope_identifier_expression(b, l + 1);
    if (!r) r = expression_tree_expression(b, l + 1);
    if (!r) r = prefixed_string_expression(b, l + 1);
    if (!r) r = prefix_unary_expression(b, l + 1);
    if (!r) r = awaitable_expression(b, l + 1);
    if (!r) r = yield_expression(b, l + 1);
    if (!r) r = cast_expression(b, l + 1);
    if (!r) r = lambda_expression(b, l + 1);
    if (!r) r = new_expression(b, l + 1);
    if (!r) r = include_expression(b, l + 1);
    if (!r) r = require_expression(b, l + 1);
    if (!r) r = anonymous_function_expression(b, l + 1);
    if (!r) r = function_pointer_expression(b, l + 1);
    if (!r) r = enum_class_label_expression(b, l + 1);
    p = r;
    r = r && expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 3 && leftMarkerIs(b, QUALIFIED_IDENTIFIER_EXPRESSION) && collection_expression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, COLLECTION_EXPRESSION, r, true, null);
      }
      else if (g < 5 && subscript_expression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, SUBSCRIPT_EXPRESSION, r, true, null);
      }
      else if (g < 5 && expression_call_expression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, EXPRESSION_CALL_EXPRESSION, r, true, null);
      }
      else if (g < 5 && selection_expression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, SELECTION_EXPRESSION, r, true, null);
      }
      else if (g < 8 && binary_expression_0(b, l + 1)) {
        r = expression(b, l, 8);
        exit_section_(b, l, m, BINARY_EXPRESSION, r, true, null);
      }
      else if (g < 10 && postfix_unary_expression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, POSTFIX_UNARY_EXPRESSION, r, true, null);
      }
      else if (g < 11 && is_expression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, IS_EXPRESSION, r, true, null);
      }
      else if (g < 12 && as_expression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, AS_EXPRESSION, r, true, null);
      }
      else if (g < 16 && consumeTokenSmart(b, T_QM)) {
        r = report_error_(b, expression(b, l, 16));
        r = ternary_expression_1(b, l + 1) && r;
        exit_section_(b, l, m, TERNARY_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // collection_type type_arguments? T_LBRACKET ( ( expression | element_initializer ) ( T_COMMA ( expression | element_initializer ) )* T_COMMA? )? T_RBRACKET
  public static boolean array_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_EXPRESSION, "<array expression>");
    r = collection_type(b, l + 1);
    r = r && array_expression_1(b, l + 1);
    r = r && consumeToken(b, T_LBRACKET);
    r = r && array_expression_3(b, l + 1);
    r = r && consumeToken(b, T_RBRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_arguments?
  private static boolean array_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_1")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  // ( ( expression | element_initializer ) ( T_COMMA ( expression | element_initializer ) )* T_COMMA? )?
  private static boolean array_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_3")) return false;
    array_expression_3_0(b, l + 1);
    return true;
  }

  // ( expression | element_initializer ) ( T_COMMA ( expression | element_initializer ) )* T_COMMA?
  private static boolean array_expression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_expression_3_0_0(b, l + 1);
    r = r && array_expression_3_0_1(b, l + 1);
    r = r && array_expression_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression | element_initializer
  private static boolean array_expression_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_3_0_0")) return false;
    boolean r;
    r = expression(b, l + 1, -1);
    if (!r) r = element_initializer(b, l + 1);
    return r;
  }

  // ( T_COMMA ( expression | element_initializer ) )*
  private static boolean array_expression_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_expression_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_expression_3_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA ( expression | element_initializer )
  private static boolean array_expression_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_COMMA);
    r = r && array_expression_3_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression | element_initializer
  private static boolean array_expression_3_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_3_0_1_0_1")) return false;
    boolean r;
    r = expression(b, l + 1, -1);
    if (!r) r = element_initializer(b, l + 1);
    return r;
  }

  // T_COMMA?
  private static boolean array_expression_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_3_0_2")) return false;
    consumeTokenSmart(b, T_COMMA);
    return true;
  }

  // T_TUPLE T_LPAREN ( expression ( T_COMMA expression )* T_COMMA? )? T_RPAREN
  public static boolean tuple_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expression")) return false;
    if (!nextTokenIsSmart(b, T_TUPLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, T_TUPLE, T_LPAREN);
    r = r && tuple_expression_2(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, TUPLE_EXPRESSION, r);
    return r;
  }

  // ( expression ( T_COMMA expression )* T_COMMA? )?
  private static boolean tuple_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expression_2")) return false;
    tuple_expression_2_0(b, l + 1);
    return true;
  }

  // expression ( T_COMMA expression )* T_COMMA?
  private static boolean tuple_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, -1);
    r = r && tuple_expression_2_0_1(b, l + 1);
    r = r && tuple_expression_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA expression )*
  private static boolean tuple_expression_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expression_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuple_expression_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_expression_2_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA expression
  private static boolean tuple_expression_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expression_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean tuple_expression_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expression_2_0_2")) return false;
    consumeTokenSmart(b, T_COMMA);
    return true;
  }

  // T_SHAPE T_LPAREN ( field_initializer ( T_COMMA field_initializer )* T_COMMA? )? T_RPAREN
  public static boolean shape_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_expression")) return false;
    if (!nextTokenIsSmart(b, T_SHAPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, T_SHAPE, T_LPAREN);
    r = r && shape_expression_2(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, SHAPE_EXPRESSION, r);
    return r;
  }

  // ( field_initializer ( T_COMMA field_initializer )* T_COMMA? )?
  private static boolean shape_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_expression_2")) return false;
    shape_expression_2_0(b, l + 1);
    return true;
  }

  // field_initializer ( T_COMMA field_initializer )* T_COMMA?
  private static boolean shape_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_initializer(b, l + 1);
    r = r && shape_expression_2_0_1(b, l + 1);
    r = r && shape_expression_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_COMMA field_initializer )*
  private static boolean shape_expression_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_expression_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!shape_expression_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shape_expression_2_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA field_initializer
  private static boolean shape_expression_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_expression_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_COMMA);
    r = r && field_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean shape_expression_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_expression_2_0_2")) return false;
    consumeTokenSmart(b, T_COMMA);
    return true;
  }

  // type_arguments? T_LBRACE ( ( expression | element_initializer ) ( T_COMMA ( expression | element_initializer ) )* T_COMMA? )? T_RBRACE
  private static boolean collection_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = collection_expression_0_0(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && collection_expression_0_2(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_arguments?
  private static boolean collection_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_expression_0_0")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  // ( ( expression | element_initializer ) ( T_COMMA ( expression | element_initializer ) )* T_COMMA? )?
  private static boolean collection_expression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_expression_0_2")) return false;
    collection_expression_0_2_0(b, l + 1);
    return true;
  }

  // ( expression | element_initializer ) ( T_COMMA ( expression | element_initializer ) )* T_COMMA?
  private static boolean collection_expression_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_expression_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = collection_expression_0_2_0_0(b, l + 1);
    r = r && collection_expression_0_2_0_1(b, l + 1);
    r = r && collection_expression_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression | element_initializer
  private static boolean collection_expression_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_expression_0_2_0_0")) return false;
    boolean r;
    r = expression(b, l + 1, -1);
    if (!r) r = element_initializer(b, l + 1);
    return r;
  }

  // ( T_COMMA ( expression | element_initializer ) )*
  private static boolean collection_expression_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_expression_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!collection_expression_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "collection_expression_0_2_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA ( expression | element_initializer )
  private static boolean collection_expression_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_expression_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_COMMA);
    r = r && collection_expression_0_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression | element_initializer
  private static boolean collection_expression_0_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_expression_0_2_0_1_0_1")) return false;
    boolean r;
    r = expression(b, l + 1, -1);
    if (!r) r = element_initializer(b, l + 1);
    return r;
  }

  // T_COMMA?
  private static boolean collection_expression_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_expression_0_2_0_2")) return false;
    consumeTokenSmart(b, T_COMMA);
    return true;
  }

  // string
  // 	| integer
  // 	| float
  // 	| true
  // 	| false
  // 	| null
  public static boolean literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPRESSION, "<literal expression>");
    r = consumeTokenSmart(b, STRING);
    if (!r) r = consumeTokenSmart(b, INTEGER);
    if (!r) r = consumeTokenSmart(b, FLOAT);
    if (!r) r = consumeTokenSmart(b, TRUE);
    if (!r) r = consumeTokenSmart(b, FALSE);
    if (!r) r = consumeTokenSmart(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // T_DOLLAR identifier
  public static boolean variable_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_expression")) return false;
    if (!nextTokenIsSmart(b, T_DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, T_DOLLAR, IDENTIFIER);
    exit_section_(b, m, VARIABLE_EXPRESSION, r);
    return r;
  }

  // T_DOLLAR_DOLLAR
  public static boolean pipe_variable_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipe_variable_expression")) return false;
    if (!nextTokenIsSmart(b, T_DOLLAR_DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_DOLLAR_DOLLAR);
    exit_section_(b, m, PIPE_VARIABLE_EXPRESSION, r);
    return r;
  }

  // T_LIST T_LPAREN expression? ( T_COMMA expression? )* T_COMMA? T_RPAREN
  public static boolean list_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expression")) return false;
    if (!nextTokenIsSmart(b, T_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, T_LIST, T_LPAREN);
    r = r && list_expression_2(b, l + 1);
    r = r && list_expression_3(b, l + 1);
    r = r && list_expression_4(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, LIST_EXPRESSION, r);
    return r;
  }

  // expression?
  private static boolean list_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expression_2")) return false;
    expression(b, l + 1, -1);
    return true;
  }

  // ( T_COMMA expression? )*
  private static boolean list_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_expression_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_expression_3", c)) break;
    }
    return true;
  }

  // T_COMMA expression?
  private static boolean list_expression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_COMMA);
    r = r && list_expression_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression?
  private static boolean list_expression_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expression_3_0_1")) return false;
    expression(b, l + 1, -1);
    return true;
  }

  // T_COMMA?
  private static boolean list_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expression_4")) return false;
    consumeTokenSmart(b, T_COMMA);
    return true;
  }

  // T_LBRACKET expression? T_RBRACKET
  private static boolean subscript_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_LBRACKET);
    r = r && subscript_expression_0_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression?
  private static boolean subscript_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_expression_0_1")) return false;
    expression(b, l + 1, -1);
    return true;
  }

  // ( identifier | T_NAMESPACE )? ( T_BACKSLASH identifier )+
  // 	| identifier
  public static boolean qualified_identifier_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_identifier_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_IDENTIFIER_EXPRESSION, "<qualified identifier expression>");
    r = qualified_identifier_expression_0(b, l + 1);
    if (!r) r = consumeTokenSmart(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( identifier | T_NAMESPACE )? ( T_BACKSLASH identifier )+
  private static boolean qualified_identifier_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_identifier_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualified_identifier_expression_0_0(b, l + 1);
    r = r && qualified_identifier_expression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( identifier | T_NAMESPACE )?
  private static boolean qualified_identifier_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_identifier_expression_0_0")) return false;
    qualified_identifier_expression_0_0_0(b, l + 1);
    return true;
  }

  // identifier | T_NAMESPACE
  private static boolean qualified_identifier_expression_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_identifier_expression_0_0_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, IDENTIFIER);
    if (!r) r = consumeTokenSmart(b, T_NAMESPACE);
    return r;
  }

  // ( T_BACKSLASH identifier )+
  private static boolean qualified_identifier_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_identifier_expression_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualified_identifier_expression_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!qualified_identifier_expression_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualified_identifier_expression_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // T_BACKSLASH identifier
  private static boolean qualified_identifier_expression_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_identifier_expression_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, T_BACKSLASH, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean parenthesized_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesized_expression")) return false;
    if (!nextTokenIsSmart(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, T_LPAREN);
    p = r;
    r = p && expression(b, l, 5);
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    exit_section_(b, l, m, PARENTHESIZED_EXPRESSION, r, p, null);
    return r || p;
  }

  // collection_type type_arguments? arguments
  public static boolean collection_call_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_call_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLLECTION_CALL_EXPRESSION, "<collection call expression>");
    r = collection_type(b, l + 1);
    r = r && collection_call_expression_1(b, l + 1);
    r = r && arguments(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_arguments?
  private static boolean collection_call_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_call_expression_1")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  // type_arguments? arguments
  private static boolean expression_call_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_call_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_call_expression_0_0(b, l + 1);
    r = r && arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_arguments?
  private static boolean expression_call_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_call_expression_0_0")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  // ( qualified_identifier_expression | variable_expression | scope_identifier_expression | pipe_variable_expression ) '::' ( identifier | variable_expression )
  public static boolean scoped_identifier_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scoped_identifier_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCOPED_IDENTIFIER_EXPRESSION, "<scoped identifier expression>");
    r = scoped_identifier_expression_0(b, l + 1);
    r = r && consumeToken(b, "::");
    r = r && scoped_identifier_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // qualified_identifier_expression | variable_expression | scope_identifier_expression | pipe_variable_expression
  private static boolean scoped_identifier_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scoped_identifier_expression_0")) return false;
    boolean r;
    r = qualified_identifier_expression(b, l + 1);
    if (!r) r = variable_expression(b, l + 1);
    if (!r) r = scope_identifier_expression(b, l + 1);
    if (!r) r = pipe_variable_expression(b, l + 1);
    return r;
  }

  // identifier | variable_expression
  private static boolean scoped_identifier_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scoped_identifier_expression_2")) return false;
    boolean r;
    r = consumeTokenSmart(b, IDENTIFIER);
    if (!r) r = variable_expression(b, l + 1);
    return r;
  }

  // T_SELF
  // 	| T_PARENT
  // 	| T_STATIC
  public static boolean scope_identifier_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_identifier_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCOPE_IDENTIFIER_EXPRESSION, "<scope identifier expression>");
    r = consumeTokenSmart(b, T_SELF);
    if (!r) r = consumeTokenSmart(b, T_PARENT);
    if (!r) r = consumeTokenSmart(b, T_STATIC);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('?->' | '->') (variablish_expression | braced_expression | keyword)
  private static boolean selection_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selection_expression_0_0(b, l + 1);
    r = r && selection_expression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '?->' | '->'
  private static boolean selection_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_expression_0_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, "?->");
    if (!r) r = consumeTokenSmart(b, "->");
    return r;
  }

  // variablish_expression | braced_expression | keyword
  private static boolean selection_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_expression_0_1")) return false;
    boolean r;
    r = expression(b, l + 1, 4);
    if (!r) r = braced_expression(b, l + 1);
    if (!r) r = keyword(b, l + 1);
    return r;
  }

  // identifier EXPRESSION_TREE_IDENTIFIER
  public static boolean expression_tree_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_tree_expression")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, IDENTIFIER, EXPRESSION_TREE_IDENTIFIER);
    exit_section_(b, m, EXPRESSION_TREE_EXPRESSION, r);
    return r;
  }

  // identifier string
  public static boolean prefixed_string_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixed_string_expression")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, IDENTIFIER, STRING);
    exit_section_(b, m, PREFIXED_STRING_EXPRESSION, r);
    return r;
  }

  // '|>'
  // 	 | '??'
  // 	 | '||'
  // 	 | '&&'
  // 	 | '|'
  // 	 | '^'
  // 	 | '&'
  // 	 | '=='
  // 	 | '!='
  // 	 | '==='
  // 	 | '!=='
  // 	 | T_LT
  // 	 | T_GT
  // 	 | '<='
  // 	 | '>='
  // 	 | '<=>'
  // 	 | T_LT_LT
  // 	 | T_GT_GT
  // 	 | T_PLUS
  // 	 | T_MINUS
  // 	 | T_DOT
  // 	 | '*'
  // 	 | '/'
  // 	 | '%'
  // 	 | '**'
  // 	 | '?:'
  // 	 | T_EQ
  // 	 | '??='
  // 	 | '.='
  // 	 | '|='
  // 	 | '^='
  // 	 | '&='
  // 	 | '<<='
  // 	 | '>>='
  // 	 | '+='
  // 	 | '-='
  // 	 | '*='
  // 	 | '/='
  // 	 | '%='
  // 	 | '**='
  private static boolean binary_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_expression_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, "|>");
    if (!r) r = consumeTokenSmart(b, "??");
    if (!r) r = consumeTokenSmart(b, "||");
    if (!r) r = consumeTokenSmart(b, "&&");
    if (!r) r = consumeTokenSmart(b, "|");
    if (!r) r = consumeTokenSmart(b, "^");
    if (!r) r = consumeTokenSmart(b, "&");
    if (!r) r = consumeTokenSmart(b, "==");
    if (!r) r = consumeTokenSmart(b, "!=");
    if (!r) r = consumeTokenSmart(b, "===");
    if (!r) r = consumeTokenSmart(b, "!==");
    if (!r) r = consumeTokenSmart(b, T_LT);
    if (!r) r = consumeTokenSmart(b, T_GT);
    if (!r) r = consumeTokenSmart(b, "<=");
    if (!r) r = consumeTokenSmart(b, ">=");
    if (!r) r = consumeTokenSmart(b, "<=>");
    if (!r) r = consumeTokenSmart(b, T_LT_LT);
    if (!r) r = consumeTokenSmart(b, T_GT_GT);
    if (!r) r = consumeTokenSmart(b, T_PLUS);
    if (!r) r = consumeTokenSmart(b, T_MINUS);
    if (!r) r = consumeTokenSmart(b, T_DOT);
    if (!r) r = consumeTokenSmart(b, "*");
    if (!r) r = consumeTokenSmart(b, "/");
    if (!r) r = consumeTokenSmart(b, "%");
    if (!r) r = consumeTokenSmart(b, "**");
    if (!r) r = consumeTokenSmart(b, "?:");
    if (!r) r = consumeTokenSmart(b, T_EQ);
    if (!r) r = consumeTokenSmart(b, "??=");
    if (!r) r = consumeTokenSmart(b, ".=");
    if (!r) r = consumeTokenSmart(b, "|=");
    if (!r) r = consumeTokenSmart(b, "^=");
    if (!r) r = consumeTokenSmart(b, "&=");
    if (!r) r = consumeTokenSmart(b, "<<=");
    if (!r) r = consumeTokenSmart(b, ">>=");
    if (!r) r = consumeTokenSmart(b, "+=");
    if (!r) r = consumeTokenSmart(b, "-=");
    if (!r) r = consumeTokenSmart(b, "*=");
    if (!r) r = consumeTokenSmart(b, "/=");
    if (!r) r = consumeTokenSmart(b, "%=");
    if (!r) r = consumeTokenSmart(b, "**=");
    return r;
  }

  // T_EM expression
  // 	| '~' expression
  // 	| T_MINUS expression
  // 	| T_PLUS expression
  // 	| T_PLUS_PLUS expression
  // 	| T_MINUS_MINUS expression
  // 	| T_PRINT expression
  // 	| T_CLONE expression
  // 	| T_AWAIT expression
  // 	| '@' expression
  public static boolean prefix_unary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_UNARY_EXPRESSION, "<prefix unary expression>");
    r = prefix_unary_expression_0(b, l + 1);
    if (!r) r = prefix_unary_expression_1(b, l + 1);
    if (!r) r = prefix_unary_expression_2(b, l + 1);
    if (!r) r = prefix_unary_expression_3(b, l + 1);
    if (!r) r = prefix_unary_expression_4(b, l + 1);
    if (!r) r = prefix_unary_expression_5(b, l + 1);
    if (!r) r = prefix_unary_expression_6(b, l + 1);
    if (!r) r = prefix_unary_expression_7(b, l + 1);
    if (!r) r = prefix_unary_expression_8(b, l + 1);
    if (!r) r = prefix_unary_expression_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // T_EM expression
  private static boolean prefix_unary_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_EM);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '~' expression
  private static boolean prefix_unary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "~");
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_MINUS expression
  private static boolean prefix_unary_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_MINUS);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_PLUS expression
  private static boolean prefix_unary_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_PLUS);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_PLUS_PLUS expression
  private static boolean prefix_unary_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_PLUS_PLUS);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_MINUS_MINUS expression
  private static boolean prefix_unary_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_MINUS_MINUS);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_PRINT expression
  private static boolean prefix_unary_expression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_PRINT);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_CLONE expression
  private static boolean prefix_unary_expression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_CLONE);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_AWAIT expression
  private static boolean prefix_unary_expression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_AWAIT);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '@' expression
  private static boolean prefix_unary_expression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expression_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "@");
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_PLUS_PLUS | T_MINUS_MINUS
  private static boolean postfix_unary_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_unary_expression_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, T_PLUS_PLUS);
    if (!r) r = consumeTokenSmart(b, T_MINUS_MINUS);
    return r;
  }

  // T_IS type
  private static boolean is_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "is_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_IS);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_AS | T_AS_OPTIONAL ) type
  private static boolean as_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = as_expression_0_0(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_AS | T_AS_OPTIONAL
  private static boolean as_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_expression_0_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, T_AS);
    if (!r) r = consumeTokenSmart(b, T_AS_OPTIONAL);
    return r;
  }

  // T_ASYNC compound_statement
  public static boolean awaitable_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "awaitable_expression")) return false;
    if (!nextTokenIsSmart(b, T_ASYNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_ASYNC);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, AWAITABLE_EXPRESSION, r);
    return r;
  }

  // T_YIELD ( expression | element_initializer )
  public static boolean yield_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression")) return false;
    if (!nextTokenIsSmart(b, T_YIELD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_YIELD);
    r = r && yield_expression_1(b, l + 1);
    exit_section_(b, m, YIELD_EXPRESSION, r);
    return r;
  }

  // expression | element_initializer
  private static boolean yield_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression_1")) return false;
    boolean r;
    r = expression(b, l + 1, -1);
    if (!r) r = element_initializer(b, l + 1);
    return r;
  }

  public static boolean cast_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expression")) return false;
    if (!nextTokenIsSmart(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = cast_expression_0(b, l + 1);
    p = r;
    r = p && expression(b, l, 15);
    exit_section_(b, l, m, CAST_EXPRESSION, r, p, null);
    return r || p;
  }

  // T_LPAREN ( T_ARRAY | T_INT | T_FLOAT | T_STRING | T_BOOL ) T_RPAREN
  private static boolean cast_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_LPAREN);
    r = r && cast_expression_0_1(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_ARRAY | T_INT | T_FLOAT | T_STRING | T_BOOL
  private static boolean cast_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expression_0_1")) return false;
    boolean r;
    r = consumeTokenSmart(b, T_ARRAY);
    if (!r) r = consumeTokenSmart(b, T_INT);
    if (!r) r = consumeTokenSmart(b, T_FLOAT);
    if (!r) r = consumeTokenSmart(b, T_STRING);
    if (!r) r = consumeTokenSmart(b, T_BOOL);
    return r;
  }

  // T_COLON expression
  private static boolean ternary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternary_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attribute_modifier? async_modifier? ( single_parameter_parameters | parameters capability_list? ( T_COLON type )? ) '==>' ( expression | compound_statement )
  public static boolean lambda_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, LAMBDA_EXPRESSION, "<lambda expression>");
    r = lambda_expression_0(b, l + 1);
    r = r && lambda_expression_1(b, l + 1);
    r = r && lambda_expression_2(b, l + 1);
    r = r && consumeToken(b, "==>");
    r = r && lambda_expression_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute_modifier?
  private static boolean lambda_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_0")) return false;
    attribute_modifier(b, l + 1);
    return true;
  }

  // async_modifier?
  private static boolean lambda_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_1")) return false;
    async_modifier(b, l + 1);
    return true;
  }

  // single_parameter_parameters | parameters capability_list? ( T_COLON type )?
  private static boolean lambda_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_parameter_parameters(b, l + 1);
    if (!r) r = lambda_expression_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // parameters capability_list? ( T_COLON type )?
  private static boolean lambda_expression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameters(b, l + 1);
    r = r && lambda_expression_2_1_1(b, l + 1);
    r = r && lambda_expression_2_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // capability_list?
  private static boolean lambda_expression_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_2_1_1")) return false;
    capability_list(b, l + 1);
    return true;
  }

  // ( T_COLON type )?
  private static boolean lambda_expression_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_2_1_2")) return false;
    lambda_expression_2_1_2_0(b, l + 1);
    return true;
  }

  // T_COLON type
  private static boolean lambda_expression_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression | compound_statement
  private static boolean lambda_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_4")) return false;
    boolean r;
    r = expression(b, l + 1, -1);
    if (!r) r = compound_statement(b, l + 1);
    return r;
  }

  public static boolean new_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_expression")) return false;
    if (!nextTokenIsSmart(b, T_NEW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, T_NEW);
    p = r;
    r = p && expression(b, l, 4);
    r = p && report_error_(b, new_expression_1(b, l + 1)) && r;
    exit_section_(b, l, m, NEW_EXPRESSION, r, p, null);
    return r || p;
  }

  // type_arguments? arguments
  private static boolean new_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = new_expression_1_0(b, l + 1);
    r = r && arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_arguments?
  private static boolean new_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_expression_1_0")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  public static boolean include_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_expression")) return false;
    if (!nextTokenIsSmart(b, T_INCLUDE, T_INCLUDE_ONCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = include_expression_0(b, l + 1);
    p = r;
    r = p && expression(b, l, 19);
    exit_section_(b, l, m, INCLUDE_EXPRESSION, r, p, null);
    return r || p;
  }

  // T_INCLUDE | T_INCLUDE_ONCE
  private static boolean include_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_expression_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, T_INCLUDE);
    if (!r) r = consumeTokenSmart(b, T_INCLUDE_ONCE);
    return r;
  }

  public static boolean require_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_expression")) return false;
    if (!nextTokenIsSmart(b, T_REQUIRE, T_REQUIRE_ONCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = require_expression_0(b, l + 1);
    p = r;
    r = p && expression(b, l, 20);
    exit_section_(b, l, m, REQUIRE_EXPRESSION, r, p, null);
    return r || p;
  }

  // T_REQUIRE | T_REQUIRE_ONCE
  private static boolean require_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_expression_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, T_REQUIRE);
    if (!r) r = consumeTokenSmart(b, T_REQUIRE_ONCE);
    return r;
  }

  // async_modifier? T_FUNCTION parameters capability_list? ( T_COLON type )? anonymous_function_use_clause? compound_statement
  public static boolean anonymous_function_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_expression")) return false;
    if (!nextTokenIsSmart(b, T_ASYNC, T_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANONYMOUS_FUNCTION_EXPRESSION, "<anonymous function expression>");
    r = anonymous_function_expression_0(b, l + 1);
    r = r && consumeToken(b, T_FUNCTION);
    r = r && parameters(b, l + 1);
    r = r && anonymous_function_expression_3(b, l + 1);
    r = r && anonymous_function_expression_4(b, l + 1);
    r = r && anonymous_function_expression_5(b, l + 1);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // async_modifier?
  private static boolean anonymous_function_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_expression_0")) return false;
    async_modifier(b, l + 1);
    return true;
  }

  // capability_list?
  private static boolean anonymous_function_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_expression_3")) return false;
    capability_list(b, l + 1);
    return true;
  }

  // ( T_COLON type )?
  private static boolean anonymous_function_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_expression_4")) return false;
    anonymous_function_expression_4_0(b, l + 1);
    return true;
  }

  // T_COLON type
  private static boolean anonymous_function_expression_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_expression_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, T_COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // anonymous_function_use_clause?
  private static boolean anonymous_function_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_expression_5")) return false;
    anonymous_function_use_clause(b, l + 1);
    return true;
  }

  // ( scoped_identifier_expression | qualified_identifier_expression ) type_arguments
  public static boolean function_pointer_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_pointer_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_POINTER_EXPRESSION, "<function pointer expression>");
    r = function_pointer_expression_0(b, l + 1);
    r = r && type_arguments(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // scoped_identifier_expression | qualified_identifier_expression
  private static boolean function_pointer_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_pointer_expression_0")) return false;
    boolean r;
    r = scoped_identifier_expression(b, l + 1);
    if (!r) r = qualified_identifier_expression(b, l + 1);
    return r;
  }

  // qualified_identifier_expression? '#' identifier
  public static boolean enum_class_label_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_class_label_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_CLASS_LABEL_EXPRESSION, "<enum class label expression>");
    r = enum_class_label_expression_0(b, l + 1);
    r = r && consumeToken(b, "#");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // qualified_identifier_expression?
  private static boolean enum_class_label_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_class_label_expression_0")) return false;
    qualified_identifier_expression(b, l + 1);
    return true;
  }

}
