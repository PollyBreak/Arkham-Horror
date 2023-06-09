package kz.stargazer.arkham_horror_client.Heroes;

import kz.stargazer.arkham_horror_client.Assets.AssetCard;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class Investigator {
    private String name;

    private int health;
    private int sanity;

    private int focusLimit;

    private HashMap<String, Integer> skills = new HashMap<>();

    private int lore;
    private int influence;
    private int observation;
    private int strength;
    private int will;

    private ArrayList<Integer> successes = new ArrayList<>();

    private ArrayList<AssetCard> assets = new ArrayList<>();

    private int actions;

    private boolean delayed;
    private boolean withMonsters;
    private boolean active;

    public Investigator(String name, int health, int sanity, int focusLimit, int lore, int influence,
                        int observation, int strength, int will, ArrayList<AssetCard> assets, int actions,
                        boolean delayed, boolean withMonsters, boolean active) {
        this.name = name;
        this.health = health;
        this.sanity = sanity;
        this.focusLimit = focusLimit;
        this.lore = lore;
        this.influence = influence;
        this.observation = observation;
        this.strength = strength;
        this.will = will;
        this.assets = assets;
        this.actions = actions;
        this.delayed = delayed;
        this.withMonsters = withMonsters;
        this.active = active;
        updateSkills();
    }

    public void updateSkills(){
        skills.put("lore", lore);
        skills.put("influence", influence);
        skills.put("observation", observation);
        skills.put("strength", strength);
        skills.put("will", will);
    }

    public void giveAdditional(int dices){
        skills.put("additional", dices);


    }


    public void move(){}

    public ArrayList<Integer> test(String skill){
        ArrayList<Integer> dices = new ArrayList<>();
//        int result = 0;
        for (int i=0; i<skills.get(skill); i++){
//            int dice = (int)(Math.random() * 6) + 1;
//            if (successes.contains(dice)){
//                result++;
//            }
            dices.add((int)(Math.random() * 6) + 1);
        }
        return dices;
    }
}
