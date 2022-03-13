## Inspiration
The war in Ukraine has united almost the whole world. With everyone trying to do whatever they can to help the brave Ukrainians, we jumped in as well and made something that utilizes technology to improve their safety.

## What it does
Rescue Safe is a Progressive Web App(PWA) that crowdsources intelligence and puts it to good use by providing real-time updates to its users.

The app gives the users the ability to upload details about themselves and their families. This information is then used to locate lost family members whose details may have been uploaded to the app's central database as a result of authorities finding the lost member. Users can also upload updates about their surroundings. These updates include geolocation, information about tanks, bombs, etc. in the vicinity, images, and so on. the app includes a live news feed that informs the user of critical alerts and news.

The user can mark themselves as 'unsafe' and 'safe' when they feel like it. Users can also request evacuation support through the app. The app then gives an estimate of the waiting time and also assigns an evacuation team. The unsafe status is also triggered by users nearby marking themselves unsafe.

All the data collected is then plotted on a map which is used for safe navigation to the nearest shelter or source of food or evacuation checkpoint. The authorities/NGOs can also use this app to upload/update information about the checkpoints and people they rescue.

## How we built it

We used Java with Spring Boot for the backend and Azure SQL database for storing data. We used HTML, CSS, and Javascript for the frontend. We also developed a containerized version of the application using Docker. We used Google's Map APIs for visualizing data like danger zones, checkpoints, camps, shelters, etc. 

## Challenges we ran into

Challenge 1: Tech stack
All 3 of us didn't have one language/framework in common which we were proficient in. This made deciding the tech stack a complex decision.

Challenge 2: Stack Overflow going offline

## Accomplishments that we're proud of

We spent a lot of time and effort in making the backend robust and versatile so that it can be utilized for various other use cases. This did result in a lack of time for the front end, however, we still managed to get a decent one ready.

Despite spending half the time just deciding what to make, we were able to work efficiently under pressure(without StackOverflow for some time) and come up with the MVP we planned to. We feel that the time spent brainstorming was worth it.

## What we learned

We learned how technology can be leveraged to help people in a faraway land with their humanitarian crisis. We also had to think like the people we are trying to help(the users) while designing the app. This showed us the importance of different perspectives.

## What's next for Rescue Safe

We have made some APIs that can be utilized for many different purposes. We have designed the app in a way that allows others to build on top of it. 

This app can be utilized for OSINT purposes too as this app collects a lot of information. 
