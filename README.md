Minecraft Forge mod providing new ores like galaxium which has its own material which has for "harvestLevel": 4 (which is just above the diamond pickaxe)
She has 2500 durability points.
15 in "efficiency" 
6 in "damage" and 12 for the level of enchetement which is a little more than the diamond


items:

    full galaxium armor
    "galaxium_ingot"
    "galaxium_nugget"
    "galaxium_sword"
    "galaxium_pickaxe"
    "galaxium_stick"
    "galaxium_apple"
    "galaxium_mixed_coal"
    "seed_strawberry"
    "strawberry"

blocks:

    "galaxium_ore" (this block is generated from layer 5 to 10 in the overworld)
    "galaxium_block"
    "galaxium_strairs"
    "galaxium_fence"
    "cave_block"
    "mossy_galaxium" (this block is generated in the new biomes (the only ones I made))
    "galaxium_meteore" (this block is generated in the new biomes (the only ones I made))
    "purifier"
    "galaxium_chest" (this chest has the same characteristics as a classic chest except that you cannot make double chests with it but it is very resistant to explosions worth item are in this chest in a safe place)


craft:

    armor: (each piece of armor (except bots) gives an effect)
    to create a galaxy armor you will need the galaxium ingot the pattern is the same as for the basic armor

    galaxium_ingot:
        g = galaxium_nugget
        [g] [g] [g]
        [g] [g] [g]
        [g] [g] [g]

    galaxium_stick:
        # = galaxium_ingot
        [ ] [ ] [ ]
        [ ] [#] [ ]
        [ ] [#] [ ]
    
    galaxy_sword:
       L = gold
       # = galaxium_ingot
       s = galaxium_stick
       [ ] [L] [ ]
       [ ] [#] [ ]
       [ ] [s] [ ]
       
    galaxium_pickaxe:
        L = gold
        # = galaxy_ingot
        s = galaxium_stick
        [#] [#] [#]
        [ ] [s] [ ]
        [ ] [L] [ ]    

    galaxium_block:
       # = galaxium_ingot
       [#] [#] [#]
       [#] [#] [#]
       [#] [#] [#]
    
    galaxium_strairs:
       d = galaxium_block
       [ ] [ ] [d]
       [ ] [d] [d]
       [d] [d] [d]

    galaxium_fence:
       d = galaxium_block
       f = galaxium_stick
       [d] [f] [d]
       [d] [f] [d]
       [ ] [ ] [ ]
    
    galaxium_apple: (gives effect)
       # = galaxium_ingot
       a = apple
       [#] [#] [#]
       [#] [a] [#]
       [#] [#] [#]
    
    galaxium_mixed_coal: (can cook 32 Item)
        # = galaxium_ingot
        c = coal
        [#] [#] [#]
        [#] [c] [#]
        [#] [#] [#]

    cave_block:
        g = galaxium_block
        n = galaxium_nugget
        [g] [n] [g]
        [n] [g] [n]
        [g] [n] [g]
    
    seed_strawberry:
        # = galaxium_ingot
        s = wheat_seeds
        [#] [#] [#]
        [#] [s] [#]
        [#] [#] [#]
    
    galaxium_chest:
        # = galaxium_ingot
        b = galaxium_block
        c = chest
        [#] [b] [#]
        [b] [c] [b]
        [#] [b] [#]
    


to get galaxium nugget you just have to put galaxium ores in an oven
you can find all these items/blocks in the creative tab dedicated to tws

update(1.2.1) a biome has been implemented a new biome(it's quite rare)it's quite dangerous case there are creepers which can pop even if it's day its group from 1 to 10 but in this biome you find "galaxium_ore" under a block of "moussy_galaxium" (the block that makes up the biome) and a block on each side and in its center you will find the block of "galaxium_ore"

update(1.3.2) a galaxium chest was added (it resists explosions compared to normal chests) and fixes were made.

install:
    it is recommended to download the .jar
    if you haven't downloaded the .jar but the code you will have to then open a terminal in the folder and run the command "./gradlew build" wait, and once finished the mod will be located in "TWS\build\ libs"

Available on Minecraft version 1.7.10