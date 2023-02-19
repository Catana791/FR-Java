package fadingrev;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class FadingRevelations extends Mod{
    
    public FadingRevelations(){}

    @Override
    public void loadContent(){

        FRBlocks.load();
        FRTechTree.load();
      
    }

}
