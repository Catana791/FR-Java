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
            requirements(Category.turret, with(Items.copper, 70, Items.lead, 35));

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
                    hitSize: 8f;
                }},
                Items.graphite, new BasicBulletType(3, 17) {{
                    width = 8f;
                    height = 8f;
                    lifetime = 50f;
                    hitSize = 8f;
                    ammoMultiplier = 3;
                }},
                Items.pyratite, new BasicBulletType(3, 16) {{
                    width = 8f;
                    height = 8f;
                    lifetime = 50f;
                    hitSize = 8f;
                    ammoMultiplier = 3;
                    status = StatusEffects.burning;
                    statusDuration = 60f * 0.5;
                }},
                Items.silicon = new BasicBulletType(3, 18) {{
                    width = 8f;
                    height = 8f;
                    lifetime = 50f;
                    hitSize = 8f;
                    ammoMultiplier = 7;
                    homingPower = 0.9f;
                    homingRange = 120f;
                }}
            );
            drawer = new DrawTurret(){{
                parts.add(new RegionPart("-back"){{
                    progress = PartProgress.warmup;
                    mirror = true;
                    moveX = 1.35f;
                    moveY = 1.5f;
                    moveRot = -22f;
                    under = true;
                    moves.add(new PartMove(PartProgress.recoil, 0, -2, -32));
                }});
            }};
            coolant = consumeCoolant(0.1f);
        }};
    }
}
