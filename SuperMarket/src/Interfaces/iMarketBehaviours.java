package Interfaces;

import Classes.Actor;

import java.util.List;

public interface iMarketBehaviours {
    void acceptToMarket(Actor actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}
