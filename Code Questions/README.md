# Code Questions

In order to proceed with the interviewing process, T-Pro asked a couple of code questions that also requires something theoretical to justify the implementation or just to provide some explanation regarding the topic.

## First Level Questions

**5. Compile any Kotlin source using `kotlinc`.**

 A: We can compile kotlin source using the following command
    kotlinc MainActivity.kt where MainActivity is the class name

**6. Create a function in Kotlin that writes 50 million random floats in a file, the memory usage should be minimum in the entire process.**

 A:

## Second Level Questions

**2. Create a code below that implements the basic concept of dependency injection.**

 A:  class Car(private val engine: Engine) {
      fun start() {
      engine.start()
      }
    }

   fun main(args: Array) {
     val engine = Engine()
     val car = Car(engine)
     car.start()
   }

**3. Implement a simple Model-View-Presenter or Model-View-ViewModel structure below, you can reuse this in the projects below. Also explain why you choose MVVM over MVP and vice versa.**

 A:  Simple Model-View-ViewModel(MVVM) structure contains 
     model package -> which contains data classes, repository pattern for API calls
     view package -> which contains view classes like activity or fragment and adapter classes
     viewmodel package -> which contains viewmodel classes 
    
     MVVM is preferred over MVP as it has less coupling between View and ViewModel. View will have reference to ViewModel but ViewModel doesn't contain a reference which decouples both and makes it easier to test the app
   

## Questions of the third level

The third level questions are on the corresponding folders, `BrokenApp` and `SimpleApp`, inside this directory.
