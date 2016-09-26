package org.steavesea.rpg_boy2000.data.maze_rats

import org.steavesea.rpg_boy2000.data.AbstractGenerator
import org.steavesea.rpg_boy2000.data.RpgBoyData
import org.steavesea.rpg_boy2000.data.Shuffler

import javax.inject.Inject

class MazeRatsMonsters extends AbstractGenerator {
    public String getName() {
        return "Monsters"
    }
    public String getDataset() {
        return RpgBoyData.MAZERATS
    }
    static final List<String> creatures = """\
Ant
Ape
Badger
Bat
Bear
Beaver
Bee
Beetle
Boar
Bulldog
Butterfly
Camel
Cat
Centipede
Chameleon
Cobra
Cockroach
Constrictor
Cougar
Cow
Coyote
Crab
Crane
Cricket
Crocodile
Crow
Cuckoo
Donkey
Dragonfly
Duck
Eagle
Eel
Elephant
Elk
Falcon
Ferret
Firefly
Fox
Frog
Goat
Goose
Hare
Hart
Hawk
Hedgehog
Hornet
Horse
Hound
Hummingbird
Jackal
Jellyfish
Leech
Lion
Locust
Lynx
Mantis
Mastodon
Mockingbird
Mole
Monkey
Moose
Moth
Mouse
Mule
Octopus
Otter
Owl
Ox
Panther
Pig
Pony
Porcupine
Possum
Rabbit
Raccoon
Rat
Reindeer
Rooster
Salamander
Scorpion
Seal
Shark
Sheep
Slug
Snail
Sparrow
Spider
Squid
Squirrel
Tiger
Toad
Turtle
Viper
Vulture
Walrus
Weasel
Whale
Wolf
Wolverine
Worm\
""".readLines()

    @Inject
    MazeRatsMonsters(Shuffler shuffler) {
        super(shuffler);
    }

    List<GString> getFormatters() {
        return [
                "${ -> pick(MazeRatsMagic.elements)} ${ -> pick(creatures)}",
                "${ -> pick(MazeRatsMagic.effects)} ${ -> pick(MazeRatsMagic.elements)} ${ -> pick(creatures)}",
                "${ -> pick(MazeRatsMagic.effects)} ${ -> pick(creatures)}",
                "${ -> pick(MazeRatsMagic.forms)} ${ -> pick(creatures)}",
                "${ -> pick(creatures)} ${ -> pick(creatures)}",
                "${ -> pick(MazeRatsMagic.effects)} ${ -> pick(creatures)} ${ -> pick(creatures)}",
        ]
    }
}
