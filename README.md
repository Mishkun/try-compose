# Try Jetpack Compose now!

This repository was made to provide a quick dive into what Jetpack Compose feels like. No need to checkout and AOSP and build everything by yourself, main job is done for you.

## Installation

Unfortunately, Jetpack Compose is not published anywhere yet. This repo helps urgent minds to play with Compose by providing all dependencies prebuilt.

### Unpack prebuilts 

Download zipped prebuilts from the [latest release](https://github.com/Mishkun/try-compose/releases/latest) and unpack it to project root replacing all the files

### Install custom version of Android studio

Compose needs custom plugins to operate. To use it, you can install custom version of Android Studio provided by wrapper script slightly modified to match this repo files structure. Just launch

```
./studiow
```

It will download Android Studio from google servers and prompt you to accept license. Type `Y` to proceed. After installing script will open Android Studio within the repo folder to play with.

## Use own prebuilts

If you want to use the most recent Jetpack Compose dependencies and can't wait for me to recompile and publish new release, but have already established project based on this template, you can build Jetpack Compose by yourself and then add the following line to your `local.properties` file

```
androidx.home="path/to/your/androidx/checkout"
```

## Feedback

Android Team created a `#compose` channel on [Kotlin's Slack](https://kotlinlang.slack.com/) to collect feedback from community. Be sure to check it out if you have anything to ask.

Also, if you speak Russian, join our [community](https://t.me/android_declarative) dedicated to declarative UI frameworks for android.

## That's all, folks!!
