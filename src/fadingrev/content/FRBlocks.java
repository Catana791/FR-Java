package fadingrev.content;

import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.entities.pattern.*;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.*;

import static mindustry.type.ItemStack.with;

public class FRBlocks{
  
    public static Block
        //defense
        trio;
  
    public static void load() {

        //defense
        trio = new ItemTurret("trio") {{
            requirements(Category.turret, with(Items.copper, 60, Items.lead, 35));

            health = 500;
            reload = 48f;
            range = 120f;
            size = 2;

            shoot = new ShootAlternate() {{
                shots = 3;
                spread = 5f;
                shotDelay = 15f;
            }};

            researchCostMultiplier = 0.1f;
            inaccuracy = 3f;
            targetAir = true;
            targetGround = true;

            ammo(
                Items.copper, new BasicBulletType(3, 14) {{
                    ammoMultiplier = 3;
                    hitSize = 8f;
                    width = 8f;
                    height = 8f;
                    lifetime = 50f;
                }}
            );
        }};
    }
}
