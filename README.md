# CinnamonTestSolution

NTT DATA Test Framework describing a range of test scenarios ranging from API, UI, DB, Cucumber, jMeter. We want to  describe complex interactions in a simple architecture.

# 1. Environment Setup

There are a few differences in configuration based on your operating system. 
Required component installation for project execution: <br>
	- Java JDK8 - for all areas of the project <br> 
	- Maven - for all areas of the project <br>
	- Chrome and Firefox browsers - for Selenium UI tests <br>
	- Execution rights to files under the src/test/resources/drivers - for Selenium UI tests  <br>
	- run solution <br>

### 1.1 Windows Setup <a name="1.1"></a>

For the windows platform we have TWO WAYS of configuring the environment. We will first take the more simple approach, install windows apps and libraries via the Chocolatey package manager. 

#### I. SETUP WITH PACKAGE MANAGER - Chocolatey (quick and easy setup)
---
```
https://chocolatey.org/
```
Go to chocolatey page, download and install the kit.

After chocolatey has been setup, open a terminal and run the commands:

```choco install jdk8```
The command will install JDK 8 and setup the Java and the Java_Home environment variables

```choco install maven```
The command will setup Maven on the machine.

You should now have a working windows environment for implementing some tests. You can double check the installation of the JDK by running:
```java -version```

### 1.2 MacOS Setup <a name="1.2"></a>

Like with Windows, we can either use a package manager to install the needed applications or we can do it manually.

#### I. Setup via Homebrew

```
https://brew.sh/
```
Installation instructions can be found on the brew website, but we will provide quick reference code snippets. So the next command will actually install homebrew, you can find the same command on their website.
```
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```
Once you have installed homebrew, you will need to add versions repositories, so we setup a stable version of Java.
```
brew tap caskroom/versions
```
You should now be able to install Java JDK 8 by running:
```
brew cask install java8
```
Now you just need to install maven and all is done:
```
brew install maven
```



### 1.3 Linux Setup <a name="1.3"></a>

Setup guide is done with Ubuntu/Debian based linux distributions.

#### OpenJDK

Linux systems will usually have an openJDK installed, so this step might be skipped. 
You will need to run the following commands in sequence.
```
sudo apt update
```
Will update the repositories list.
```
sudo apt install openjdk-8-jdk
```
It will install open JDK on your machine

```
sudo apt install maven
```

#### Oracle JDK

Alternatively, you can install the oracle JDK
```
add-apt-repository ppa:webupd8team/java
```
It will add repository for oracle packages

```
apt update
```
Will update the list of dependencies on your computer

```
apt install oracle-java8-installer
```
Will install oracle JDK 8



# 2. Project Run 

