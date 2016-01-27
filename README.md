# quadratic-solver
Fun little GUI project to compute real and imaginary roots of a quadratic function given a, b, and c

My favorite part is this:
```java
+ (textField1.getText().equals("0")? "":(textField1.getText().equals("1")? "x\u00b2":textField1.getText() + "x\u00b2"))
+ (textField2.getText().equals("0")? "":" + " + (textField2.getText().equals("1")? "x":textField2.getText() + "x"))
+ (textField3.getText().equals("0")? "":" + " + textField1.getText())
```
which formats the quadratic equation using some fancy nested [conditional operators](https://en.wikipedia.org/wiki/%3F:).
