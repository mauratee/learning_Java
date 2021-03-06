// // #### GENERAL #### //

// Java is STATICALLY-TYPED which means variables must be declared
// Whitespace doesn't have syntax meaning
// Semicolons
// => Use after expressions, method calls, variable declarations
// => Don't need semicolon after "blocks"
//      e.g, if stmts, loops, class/method definitions
// => Code won't compile if semicolons are missing


// //  #### TYPES OF VARIABLES #### //
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html

// => Instance Variables (Non-Static Fields)
// => Class Variables (Static Fields)
// => Local Variables
// => Parameters


// // #### NAMING CONVENTIONS #### //
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.htmls

// variable names are case-sensitive
// => white space not permitted in variable names
// => "$" and "_" technically allowed in var names, but
// => strong convention is to NOT use "$" or "_" in var names
// => can be unlimited length

// use full words for variables instead of cryptic abbreviations
// variable name must not be keyword or reserved word
// if var name is one word, use all lowercase
// if var is more than one word, use camelCase
// if var stores constant value, use all caps, words separated by underscore
// never use underscore for anything else!


// // #### DATA TYPES #### //

// Primitive Data Types
// byte
// => an 8-bit signed two's complement integer
// => minimum value is -128
// => maximum value 127 (inclusive)
// => useful for saving memory in large arrays
// short
// int
// long
// => ends in "L"
// float
// double
// boolean
// char
// => a single 16-bit Unicode character

// String class
// from java.lang.String
// => create a new String object by enclosing character string in double quotes
// => String objects are immutable
// => not technically a primitive data types

// Fields that are declared but not initialized will be set to
// a default value, usually 0 or null. Relying on default values
// is considered bad programming style

// Local variables will not have a default value assigned if not initialized.




