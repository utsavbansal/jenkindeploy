###creating jar from saiafarm spring code:
* edit root level and saiafarming > resources level application.propertsies for settings
#####Intellij settings:
* make sure to have jdk 1.8 in run>editconfiguration>build and Run 
* change sdk version in project struncture>project settings>project to 1.8
* Add additional command line parameter -Xlint:unchecked in file>settings>build,execution...>Compiler>java compiler>additional command line parameter

make sure to change application.properties file at 3 places. Root level. in both saiafarm and server foleder at this location : src>resources>application.properties

output is generated in server>saiafarming>target
