package com.example.test1sp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test1SpApplicationTests {

    @Test
    void testBattalionAttacks(){

        CreatureFactory factory = new CreatureFactory();
        Creature gnome = factory.createCreature("gnome");
        Creature elf = factory.createCreature("elf");
        Creature ent = factory.createCreature("ent");


        Battalion battalion = new Battalion();
        battalion.addCreature(gnome);
        battalion.addCreature(elf);
        battalion.addCreature(ent);


        assertNotNull(battalion);
        battalion.attack();

    }

    @Test
    void testBattalionDefends() {

        CreatureFactory factory = new CreatureFactory();
        Creature gnome = factory.createCreature("gnome");
        Creature elf = factory.createCreature("elf");
        Creature ent = factory.createCreature("ent");


        Battalion battalion = new Battalion();
        battalion.addCreature(gnome);
        battalion.addCreature(elf);
        battalion.addCreature(ent);


        assertNotNull(battalion);
        battalion.defend();

    }

}
