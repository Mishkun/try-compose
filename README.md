# Try Jetpack Compose now!

This repository was made to provide a quick dive into what Jetpack Compose feels like. No need to checkout and AOSP and build everything by yourself, main job is done for you.

## Installation

Unfortunately, Jetpack Compose is not published anywhere yet. This repo helps urgent minds to play with Compose by providing all dependencies prebuilt.

### Install git-lfs 

This repo uses [git-lfs](https://git-lfs.github.com) to  operate with prebuilts for the Compose dependencies. You need to install before cloning for smooth experience.

### Install custom version of Android studio

Compose needs custom plugins to operate. To use it, you can install custom version of Android Studio provided by wrapper script slightly modified to match this repo files structure. Just launch

```
./studiow
```

It will download Android Studio from google servers and prompt you to accept license. Type `Y` to proceed. After installing script will open Android Studio within the repo folder to play with.

## Feedback

Android Team created a `#compose` channel on [Kotlin's Slack](https://kotlinlang.slack.com/) to collect feedback from community. Be sure to check it out if you have anything to ask.

## That's all, folks!
