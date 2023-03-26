package kz.stargazer.arkham_horror_client.Assets;

import kz.stargazer.arkham_horror_client.Heroes.Investigator;

public abstract class AssetCard {
    private int action;
    abstract void use(Investigator hero);
}
