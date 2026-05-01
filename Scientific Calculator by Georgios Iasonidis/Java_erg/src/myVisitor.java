import java.lang.Math;


public class myVisitor extends HelloBaseVisitor<Object> {

    // Method for addition
    @Override
    public Object visitAdd_op(HelloParser.Add_opContext poc) {
        String v1 = poc.children.get(0).getText(); // Value of the first number
        String v2 = poc.children.get(2).getText(); // Value of the second number
        String result;

        try {  
            int n1 = Integer.parseInt(v1); // Convert the first number to an integer
            try {  
                int n2 = Integer.parseInt(v2); // Convert the second number to an integer
                result = Integer.toString(n1 + n2); // Sum of integers
            } catch(NumberFormatException nfe) {  
                result = v1 + v2; // Concatenation if the second number is not an integer
            }  
        } catch(NumberFormatException nfe) {  
            result = v1 + v2; // Concatenation if the first number is not an integer
        }  

        System.out.println(v1 + " + " + v2 + " = " + result); // Display the result
        return null;
    }

    // Method for subtraction
    @Override
    public Object visitMinus_op(HelloParser.Minus_opContext poc) {
        String v1 = poc.children.get(0).getText(); // Value of the first number
        String v2 = poc.children.get(2).getText(); // Value of the second number
        String result;

        try {  
            int n1 = Integer.parseInt(v1); // Convert the first number to an integer
            try {  
                int n2 = Integer.parseInt(v2); // Convert the second number to an integer
                result = Integer.toString(n1 - n2); // Subtraction of integers
            } catch(NumberFormatException nfe) {  
                result = "Not supported for strings"; // Message for unsupported operation
            }  
        } catch(NumberFormatException nfe) {  
            result = "Not supported for strings"; // Message for unsupported operation
        }  

        System.out.println(v1 + " - " + v2 + " = " + result); // Display the result
        return null;
    }

    // Method for multiplication
    @Override
    public Object visitMulti_op(HelloParser.Multi_opContext poc) {
        String v1 = poc.children.get(0).getText(); // Value of the first number
        String v2 = poc.children.get(2).getText(); // Value of the second number
        String result;

        try {  
            int n1 = Integer.parseInt(v1); // Convert the first number to an integer
            try {  
                int n2 = Integer.parseInt(v2); // Convert the second number to an integer
                result = Integer.toString(n1 * n2); // Multiplication of integers
            } catch(NumberFormatException nfe) {  
                result = "Not supported for strings"; // Message for unsupported operation
            }  
        } catch(NumberFormatException nfe) {  
            result = "Not supported for strings"; // Message for unsupported operation
        }  

        System.out.println(v1 + " * " + v2 + " = " + result); // Display the result
        return null;
    }

    // Method for division
    public Object visitDiv_op(HelloParser.Div_opContext poc) {
        String v1 = poc.children.get(0).getText(); // Value of the first number
        String v2 = poc.children.get(2).getText(); // Value of the second number
        String result;

        try {  
            int n1 = Integer.parseInt(v1); // Convert the first number to an integer
            try {  
                int n2 = Integer.parseInt(v2); // Convert the second number to an integer
                if (n2 == 0) {
                    result = "Division by zero error"; // Message for division by zero
                } else {
                    result = Integer.toString(n1 / n2); // Integer division
                }
            } catch(NumberFormatException nfe) {  
                result = "Not supported for strings"; // Message for unsupported operation
            }  
        } catch(NumberFormatException nfe) {  
            result = "Not supported for strings"; // Message for unsupported operation
        }  

        System.out.println(v1 + " / " + v2 + " = " + result); // Display the result
        return null;
    }
	
	// Method for exponentiation
    public Object visitPow_op(HelloParser.Pow_opContext poc) {
        String v1 = poc.children.get(0).getText(); // Value of the base
        String v2 = poc.children.get(2).getText(); // Value of the exponent
        String result;

        try {
            int base = Integer.parseInt(v1); // Convert base to integer
            try {
                int exponent = Integer.parseInt(v2); // Convert exponent to integer
                result = Integer.toString((int) Math.pow(base, exponent)); // Power calculation
            } catch (NumberFormatException nfe) {  
                result = "Exponent must be an integer"; // Message for unsupported exponent
            }
        } catch (NumberFormatException nfe) {  
            result = "Base must be an integer"; // Message for unsupported base
        }

        System.out.println(v1 + " ^ " + v2 + " = " + result); // Display the result
        return null;
    }
    // Method for sine
    @Override
    public Object visitSin_op(HelloParser.Sin_opContext soc) {
        // Extract the number inside the SIN function from the parse tree
        String v1 = soc.NUM().getText();
        String result;

        try {
            // Try to convert the extracted string to a double
            double num = Double.parseDouble(v1);
            // Calculate the sine of the number (converted to degrees) and convert the result to a string
            result = Double.toString(Math.sin(Math.toRadians(num)));
        } catch (NumberFormatException nfe) {
            // If conversion fails, set the result to an error message
            result = "The input must be a number";
        }

        // Print the sine result to the console
        System.out.println("sin(" + v1 + ") = " + result);
        return null;
    }

    public Object visitCos_op(HelloParser.Cos_opContext coc) {
        // Extract the number inside the COS function from the parse tree
        String v1 = coc.NUM().getText();
        String result;

        try {
            // Try to convert the extracted string to a double
            double num = Double.parseDouble(v1);
            // Calculate the cosine of the number (converted to degrees) and convert the result to a string
            result = Double.toString(Math.cos(Math.toRadians(num)));
        } catch (NumberFormatException nfe) {
            // If conversion fails, set the result to an error message
            result = "The input must be a number";
        }

        // Print the cosine result to the console
        System.out.println("cos(" + v1 + ") = " + result);
        return null;
    }

    // Method for tangent
    public Object visitTan_op(HelloParser.Tan_opContext toc) {
        // Extract the number inside the TAN function from the parse tree
        String v1 = toc.NUM().getText();
        String result;

        try {
            // Try to convert the extracted string to a double
            double num = Double.parseDouble(v1);
            // Calculate the tangent of the number (converted to degrees) and convert the result to a string
            result = Double.toString(Math.tan(Math.toRadians(num)));
        } catch (NumberFormatException nfe) {
            // If conversion fails, set the result to an error message
            result = "The input must be a number";
        }

        // Print the tangent result to the console
        System.out.println("tan(" + v1 + ") = " + result);
        return null;
    }

    // Method for cotangent
    public Object visitCot_op(HelloParser.Cot_opContext coc) {
        // Extract the number inside the COT function from the parse tree
        String v1 = coc.NUM().getText();
        String result;

        try {
            // Try to convert the extracted string to a double
            double num = Double.parseDouble(v1);
            // Calculate the tangent of the number (converted to degrees)
            double tanValue = Math.tan(Math.toRadians(num));
            if (tanValue == 0) {
                result = "Cotangent is undefined (tan(" + num + ") is 0)"; // Message for undefined cotangent
            } else {
                result = Double.toString(1.0 / tanValue); // Calculate cotangent and convert it to a string
            }
        } catch (NumberFormatException nfe) {
            result = "The input must be a number"; // Message for invalid number
        }

        // Print the cotangent result to the console
        System.out.println("cot(" + v1 + ") = " + result);
        return null;
    }


    // Method for modulo operation
    public Object visitMod_op(HelloParser.Mod_opContext poc) {
        String v1 = poc.children.get(0).getText(); // Value of the first number
        String v2 = poc.children.get(2).getText(); // Value of the second number
        String result;

        try {  
            int n1 = Integer.parseInt(v1); // Convert the first number to an integer
            try {  
                int n2 = Integer.parseInt(v2); // Convert the second number to an integer
                if (n2 == 0) {
                    result = "Modulo by zero error"; // Message for modulo by zero
                } else {
                    result = Integer.toString(n1 % n2); // Remainder of division
                }
            } catch(NumberFormatException nfe) {  
                result = "Not supported for strings"; // Message for unsupported operation
            }  
        } catch(NumberFormatException nfe) {  
            result = "Not supported for strings"; // Message for unsupported operation
        }

        System.out.println(v1 + " % " + v2 + " = " + result); // Display the result
        return null;
    }

	// Method for AND operation
    public Object visitAnd_op(HelloParser.And_opContext poc) {
        String v1 = poc.children.get(0).getText().toUpperCase(); // Value of the first input in uppercase
        String v2 = poc.children.get(2).getText().toUpperCase(); // Value of the second input in uppercase
        String result;

        if (!(v1.equals("TRUE") || v1.equals("FALSE")) || !(v2.equals("TRUE") || v2.equals("FALSE"))) {
            result = "Wrong input"; // Message for invalid input
        } else {
            result = v1.equals("TRUE") && v2.equals("TRUE") ? "TRUE" : "FALSE"; // AND result
        }

        System.out.println(v1 + " && " + v2 + " = " + result); // Display the result
        return null;
    }

    // Method for OR operation
    public Object visitOr_op(HelloParser.Or_opContext poc) {
        String v1 = poc.children.get(0).getText().toUpperCase(); // Value of the first input in uppercase
        String v2 = poc.children.get(2).getText().toUpperCase(); // Value of the second input in uppercase
        String result;

        if (!(v1.equals("TRUE") || v1.equals("FALSE")) || !(v2.equals("TRUE") || v2.equals("FALSE"))) {
            result = "Wrong input"; // Message for invalid input
        } else {
            result = v1.equals("TRUE") || v2.equals("TRUE") ? "TRUE" : "FALSE"; // OR result
        }

        System.out.println(v1 + " || " + v2 + " = " + result); // Display the result
        return null;
    }


    // Method for NOT logical operation
    public Object visitNot_op(HelloParser.Not_opContext poc) {
        String v1 = poc.children.get(1).getText().toUpperCase(); // Value of the input
        String result;

        if (!v1.equals("TRUE") && !v1.equals("FALSE")) {
            result = "Wrong input"; // Message for invalid input
        } else {
            result = v1.equals("TRUE") ? "FALSE" : "TRUE"; // NOT result
        }

        System.out.println("! " + v1 + " = " + result); // Display the result
        return null;
    }


    // Method for XOR operation
    public Object visitXor_op(HelloParser.Xor_opContext foc) {
        String v1 = foc.children.get(0).getText().toUpperCase(); // Value of the first input
        String v2 = foc.children.get(2).getText().toUpperCase(); // Value of the second input
        String result;

        try {
            boolean b1 = Boolean.parseBoolean(v1); // Convert to boolean
            boolean b2 = Boolean.parseBoolean(v2); // Convert to boolean
            result = (b1 ^ b2) ? "TRUE" : "FALSE"; // XOR result
        } catch (NumberFormatException nfe) {
            result = "Wrong input"; // Message for invalid input
        }

        System.out.println(v1 + " XOR " + v2 + " = " + result); // Display the result
        return null;
    }
    
    // Method for NAND operation
    @Override
    public Object visitNand_op(HelloParser.Nand_opContext poc) {
        String v1 = poc.children.get(0).getText().toUpperCase(); // Value of the first input
        String v2 = poc.children.get(2).getText().toUpperCase(); // Value of the second input
        String result;

        if (!(v1.equals("TRUE") || v1.equals("FALSE")) || !(v2.equals("TRUE") || v2.equals("FALSE"))) {
            result = "Wrong input"; // Message for invalid input
        } else {
            boolean b1 = Boolean.parseBoolean(v1); // Convert to boolean
            boolean b2 = Boolean.parseBoolean(v2); // Convert to boolean
            boolean nandResult = !(b1 && b2); // NAND result
            result = nandResult ? "TRUE" : "FALSE"; // Convert result to string
        }

        System.out.println(v1 + " NAND " + v2 + " = " + result); // Display the result
        return null;
    }


    // Method for logarithm
    public Double visitLog_op(HelloParser.Log_opContext coc) {
        String v1 = coc.NUM().getText(); // Value of the input from coc.num()
        Double result = null;

        try {
            double num = Double.parseDouble(v1); // Convert the input to a number
            if (num <= 0) {
                System.out.println("LOG(" + v1 + ") = Logarithm undefined for non-positive numbers"); // Display message for invalid input
            } else {
                result = Math.log10(num); // Calculate logarithm
                System.out.println("LOG(" + v1 + ") = " + result); // Display the result
            }
        } catch (NumberFormatException nfe) {
            System.out.println("LOG(" + v1 + ") = Input must be a number"); // Display message for invalid input
        }

        return result;
    }


 // Method for factorial calculation
    public Object visitFactorial_op(HelloParser.Factorial_opContext foc) {
        String v1 = foc.NUM().getText(); // Value of the input from foc.num()
        String result;

        try {
            int n = Integer.parseInt(v1); // Convert the input to an integer
            if (n < 0) {
                result = "Factorial not defined for negative numbers"; // Message for invalid input
            } else {
                int factorial = 1;
                for (int i = 2; i <= n; i++) {
                    factorial *= i; // Calculate factorial
                }
                result = Integer.toString(factorial); // Convert the result to a string
                System.out.println("Fact " + v1 +" = " + result); // Display the result
            }
        } catch (NumberFormatException nfe) {
            result = "Input must be an integer"; // Message for invalid input
        }

        return null;
    }

    // Method for the value of pi
    public Object visitP_op(HelloParser.P_opContext poc) {
        String v1 = poc.children.get(0).getText(); // input value
        String result;

        try {
            if(v1.equals("P")) { // Check if v1 is "p"
                result = Double.toString(Math.PI);  // If yes, returns the value of pi
            }
            else {  // If not, returns the value of -pi
                result = Double.toString(Math.PI*-1);
            }
        } 
        catch(NumberFormatException nfe) {  // message that it is not an integer
                  result = "Not supported for strings";
            }

        System.out.println(v1 + " = " + result);
        return null;
    }

 // Method for square root
    @Override
    public Double visitSqrt_op(HelloParser.Sqrt_opContext poc) {
        String v1 = poc.NUM().getText(); // Value of the input from poc.num()
        Double result = null;

        try {
            double num = Double.parseDouble(v1); // Convert the input to a number
            if (num < 0) {
                System.out.println("sqrt: " + v1 + " = Not supported for negative numbers"); // Display message for invalid input
            } else {
                result = Math.sqrt(num); // Calculate square root
                System.out.println("sqrt: " + v1 + " = " + result); // Display the result
            }
        } catch (NumberFormatException nfe) {
            System.out.println("sqrt: " + v1 + " = Not supported for strings"); // Display message for invalid input
        }

        return result;
    }


    // Method for the value of e
    public Object visitE_op(HelloParser.E_opContext poc) {
        String v1 = poc.children.get(0).getText(); // input value
        String result;

        try {
            if(v1.equals("E")) { // Check if v1 is "e"
                result = Double.toString(Math.E); // If yes, returns the value of e
            }
            else { // If not, returns the value of -e
                result = Double.toString(Math.E*-1);
            }
        } 
        catch(NumberFormatException nfe) {  // Message for invalid input
                  result = "Not supported for strings";
            }
        System.out.println(v1 + " = " + result); // Print the initial value and the result
        return null;
    }
    
}