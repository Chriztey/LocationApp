
Need to add this in build.gradle.kts :
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

to able to import compose.viewModel, and use viewModel() in MainActivity

Add Location Dependencies :
implementation("com.google.android.gms:play-services-location:21.0.1") allow access location API (Gmaps)
