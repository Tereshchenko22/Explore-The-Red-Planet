Explore The Red Planet
==================================

The Mars Photo Viewer App is an Android application that allows users to view photos of Mars captured by various missions and available on an internet server. With this app, users can explore and discover stunning images of the Martian landscape right from their Android devices.

Screenshots
------------
![mars1](https://github.com/Tereshchenko22/Explore-The-Red-Planet/assets/98280660/d656d837-7980-4d62-8dbe-245e699e17fc)
![mars2](https://github.com/Tereshchenko22/Explore-The-Red-Planet/assets/98280660/5ff0ed80-641d-4b86-b16b-b1cc1f7ba82b)

Installation
------------
1. Clone the repository to your local machine using the following command:
git clone https://github.com/Tereshchenko22/Explore-The-Red-Planet

2. Open the project in Android Studio.

3. Build the project to ensure that all dependencies are resolved.

4. Connect an Android device or use an emulator with API level 26 or higher.

5. Run the app on the device/emulator using Android Studio.

Permissions
--------------
The Mars Photo Viewer App requires the following permissions:

- Internet access to fetch photos from the internet server.


Technologies Used
---------------

- Kotlin: The app is developed using the Kotlin programming language.
- Android Architecture Components: The app follows the recommended Android architectural guidelines and utilizes components like ViewModel, LiveData.
- Retrofit: Used for making API requests to fetch the photos from the internet server.
- Moshi: Used for parsing JSON  into Kotlin classes.
- Coil: Used for fast image loading by Coroutines 
- RecyclerView: Used for displaying the photo collection in a scrollable list.

