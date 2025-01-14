# Scala Auxiliary Constructor Bug
This repository demonstrates a potential issue with auxiliary constructors in Scala.  The `BuggyAuxiliaryConstructor.scala` file shows how side effects in the primary constructor might be missed if only the default auxiliary constructor is used. The `FixedAuxiliaryConstructor.scala` provides a solution for avoiding this problem.  This example showcases a common pitfall for developers transitioning to Scala from other OOP languages. 