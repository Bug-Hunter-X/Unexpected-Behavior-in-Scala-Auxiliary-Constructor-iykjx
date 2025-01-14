```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}
```
This code is perfectly valid Scala, but the auxiliary constructor may lead to unexpected behavior if not carefully considered.  If `x` is used in the primary constructor to initialize other class members or perform side effects, those actions will only be performed if a value other than 0 is passed into `MyClass`. If `MyClass` is always instantiated using the default constructor, these side effects will be missed, leading to subtle bugs. 