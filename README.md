# RPG-Pad

## Overview

[![Build status](https://circleci.com/gh/stevesea/RPGpad.svg?&style=shield&circle-token=d5b638c2be4157b4b3bdd347bd139c392968d7db)](https://circleci.com/gh/stevesea/RPGpad)
[![Build Status](https://travis-ci.org/stevesea/RPGpad.svg?branch=master)](https://travis-ci.org/stevesea/RPGpad)

This is an Android application which randomly generates configurable things for tabletop RPGs
(names, spells, items, monsters, etc). The application uses content produced by the following individuals:

* Perilous Wilds, by Jason Lutes. http://lampblackandbrimstone.blogspot.com/
* Freebooters on the Frontier, by Jason Lutes. http://lampblackandbrimstone.blogspot.com/
* Maze Rats 0.1, by Ben Milton. http://questingblog.com/maze-rats/

## Roadmap

* ~~Implement enough it's ready for consumption~~
* **1.0-beta** use Crashlytics' Beta
    * https://betas.to/guJ4ZNqt  - this link will let you install Crashlytics' Beta app, which allows
     me to track usage, crashes, and keep beta users updated with new versions as I fix problems
    * ~~announce to smaller G+ audience, and my local gaming group~~
    * announce to wider audience on G+ (OSR, DW Tavern, Gauntlet)
    * Development tasks during beta
        * polish UI
        * fix bugs and enhancements (usability, formatting) things brought up during beta
        * ~~figure out less generic name than 'RPG-Pad'~~
* **1.0** Publish on Google Play
    * ~~register as developer~~
    * publish
    * create GitHub web page for the project (separate from the source page)
* **2.0** More content, easier to maintain content
    * ~~rather than Groovy GStrings & closures, use a templating engine~~
    * make application more data-driven, and easier for other people to submit content
    * get suggestions from beta users and G+ community for new random generator content
* **Future**
    * move the result generation into a backend REST API. that'll make it much easier to create
      thinner clients for android/iOS/web. also, learning AWS or other hosting will be fun :D


## Goals

* Teach myself Android, Groovy, and mobile development
* I'm interested generating randomized RPG sandbox content using
  * complex random tables that involve a handful of dice and multiple
    interrelated tables (Perilous Wilds is a good example).
  * evocative, interesting random table entries.

* I'm not particularly interested in turning this app into a general-purpose random-generator engine --
  I don't want 20+ variations of name-generation tables


## Other random generators with the same/similar content

https://perilous-wilds.geekwire.net/region

http://www.random-generator.com/index.php?title=Category:Dungeon_World


## Screenshots

![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/initial_screen.png "The initial screen")
![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/nav_drawer.png "Sliding nav bar, acknowledgements")

### The Perilous Wilds

#### Exploration

![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/pw_danger.png "Perilous Wilds - Danger")
![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/pw_discovery.png "Perilous Wilds - Discovery")
![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/pw_explore_dungeon.png "Perilous Wilds - Explore Dungeon")
![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/pw_treasure.png "Perilous Wilds - Treasure ")

#### Creating locations

![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/pw_dungeon.png "Perilous Wilds - Dungeon ")
![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/pw_steading.png "Perilous Wilds - Steading ")

#### Creating NPCs and Hirelings

![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/pw_follower.png "Perilous Wilds - Follower ")
![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/pw_npc.png "Perilous Wilds - NPC ")
![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/pw_monster.png "Perilous Wilds - Monster ")

### Maze Rats

![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/mr_chars.png "Maze Rats - characters")
![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/mr_monsters.png "Maze Rats - monsters")
![alt text](https://github.com/stevesea/RPGpad/raw/master/docs/images/mr_spells.png "Maze Rats - spells")


## License
This project is licensed under [GNU General Public License, version 3 (GPL-3.0)](https://opensource.org/licenses/GPL-3.0).

