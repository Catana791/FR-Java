package fadingrev;

import fadingrev.content.FRBlocks;
import mindustry.mod.*;

public class FadingRevelations extends Mod{
    
    public FadingRevelations(){}

    @Override
    public void loadContent(){
        FRBlocks.load();
    }
}
