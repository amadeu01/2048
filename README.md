# 2048
2048 Clone

This is a 2048 game clone using Data Binding of Android. And MVVM architecture pattern.


Model <-- ModelView <--> View
                   * --- 1

View has a reference to ViewModel but ViewModel has no information about the View.
he MVVM pattern supports two-way data binding between the View and ViewModel and there is a many-to-one relationship between View and ViewModel.
