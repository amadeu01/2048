# 2048
2048 Clone

This is a 2048 game clone using Data Binding of Android. And MVVM architecture pattern.


Model <-- ModelView <--> View
                   * --- 1

View has a reference to ViewModel but ViewModel has no information about the View.
he MVVM pattern supports two-way data binding between the View and ViewModel and there is a many-to-one relationship between View and ViewModel.


## Model
Model refers either to a domain model, which represents real state content (an object-oriented approach), or to the data access layer, which represents content (a data-centric approach).

## View
As in the MVC and MVP patterns, the view is the structure, layout, and appearance of what a user sees on the screen.

## View model
The view model is an abstraction of the view exposing public properties and commands. Instead of the controller of the MVC pattern, or the presenter of the MVP pattern, MVVM has a binder. In the view model, the binder mediates communication between the view and the data binder. The view model has been described as a state of the data in the model.[7]

## Binder
Declarative data and command-binding are implicit in the MVVM pattern. In the Microsoft solution stack, the binder is a markup language called XAML.[8] The binder frees the developer from being obliged to write boiler-plate logic to synchronize the view model and view. When implemented outside of the Microsoft stack the presence of a declarative databinding technology is a key enabler of the pattern.

[Souce](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel)
