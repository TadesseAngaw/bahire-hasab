![Bahire Hasab](images/main screen.png?raw=true "Bahire Hasab")


# Bahire Hasab
## Ethiopian Calendar Desktop App

[በአማርኛ ለማንበብ](README_AM.md)

Bahire Hasab was a side project of mine when I was in school. I was fascinated by desktop app development back then, and this project was completed in 2016. 

I didn't make any changes to the code after 2017. I was thinking to optimize some logic and UI but my current thought is to share the source code as it is for now and optimize it later with contributions from others. I will accept any pull request if anyone wants to contribute.  

It is created with Java swing using [NetBeans GUI builder](https://netbeans.apache.org/kb/docs/java/quickstart-gui.html). 

Holidays and fasting days are calculated with Bahire Hasab formula which was prepared by [Pope Demetrius I of Alexandria](https://en.wikipedia.org/wiki/Pope_Demetrius_I_of_Alexandria) back in the 3rd century 


## Features

- Ethiopian calendar with month view
- Major and minor feasts of the lord in the Ethiopian orthodox church (notifications included)
- Fasting in Ethiopian orthodox church (notifications included)
- 33 Feasts of St Mary
- Gregorian to Ethiopian calendar converter
- Also Arabic to geez number converter


## Getting Started
- Install the latest NetBeans (Apache Netbeans now)
- Clone the project from the GitHub repo
- Open the project from NetBeans
- Try to run from the IDE

**I will prepare better getting started documentation later**

##Roadmap
- [ ] Release installers for Windows and macOS
- [ ] Improve Gregorian date conversion logic
- [ ] Improve geez to Arabic number conversion logic
- [ ] Release **EthiopianCalendar** class (which performs most of bahire hasab calculations) as a separate library for Java and Kotlin


##Known Issues
I saw the app has some conversion issues while converting Ethiopian dates to Gregorian. Which happens when trying to convert dates around January. This is because I used custom calculation to convert dates without setting any reference date to convert. I will improve the logic if possible or I will use specific date references for conversion.

## Sister Project

This Bahire Hasab is a desktop app. There is another project called Bahire Hasab Tray which was intended to run in a system tray to show notifications and a minimalistic calendar. On packaging (windows or mac installer) both projects will be merged into a single artifact. Please check [bahire-hasab-tray](https://github.com/TadesseAngaw/bahire-hasab-tray)


