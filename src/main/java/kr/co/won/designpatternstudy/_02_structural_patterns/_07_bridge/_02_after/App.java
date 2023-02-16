package kr.co.won.designpatternstudy._02_structural_patterns._07_bridge._02_after;

import kr.co.won.designpatternstudy._02_structural_patterns._07_bridge._02_after.champion.Champion;
import kr.co.won.designpatternstudy._02_structural_patterns._07_bridge._02_after.champion.skin.KDA;
import kr.co.won.designpatternstudy._02_structural_patterns._07_bridge._02_after.champion.skin.PoolParty;
import kr.co.won.designpatternstudy._02_structural_patterns._07_bridge._02_after.champion.아리;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();
        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillQ();
        poolParty아리.skillW();
    }
}
