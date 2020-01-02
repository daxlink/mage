package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

public final class ArtifactWallToken extends TokenImpl {

    public ArtifactWallToken() {
        super("Wall", "colorless 0/4 Wall artifact creature token with defender");
        cardType.add(CardType.ARTIFACT);
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.WALL);
        power = new MageInt(0);
        toughness = new MageInt(4);
    }

    private ArtifactWallToken(final ArtifactWallToken token) {
        super(token);
    }

    public ArtifactWallToken copy() {
        return new ArtifactWallToken(this);
    }
}
