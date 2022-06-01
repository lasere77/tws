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

blocks:

    "galaxium_ore" (this block is generated from layer 5 to 10 in the overworld)
    "galaxium_block"
    "galaxium_strairs"
    "galaxium_fence"
    "cellar_block"
    "galaxium_trophy" (this block is currently under development)


craft:

    armor:
    to create a galaxy armor you will need the galaxium ingot the pattern is the same as for the basic armor
    
    galaxy_sword:
        L = gold
        # = galaxy_ingot
        [ ] [L] [ ]
        [ ] [#] [ ]
        [ ] [#] [ ]
        
    galaxium_pickaxe:
        L = gold
        # = galaxy_ingot
        [#] [#] [#]
        [ ] [#] [ ]
        [ ] [L] [ ]

    galaxium_ingot:
        g = galaxium_nugget
        [g] [g] [g]
        [g] [g] [g]
        [g] [g] [g]

    galaxium_nugget:
       # = galaxium_ingot
       [#] [#] [#]
       [#] [#] [#]
       [#] [#] [#]
    
    galaxium_stick:
       # = galaxium_ingot
       [ ] [ ] [ ]
       [ ] [#] [ ]
       [ ] [#] [ ]
    
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



to get galaxium nugget you just have to put galaxium ores in an oven
you can find all these items/blocks in the creative tab dedicated to tws

install:

    it is recommended to download the .jar
    if you haven't downloaded the .jar but the code you will have to then open a terminal in the folder and run the command "./gradlew build" wait, and once finished the mod will be located in "TWS\build\ libs"

Available on Minecraft version 1.7.10