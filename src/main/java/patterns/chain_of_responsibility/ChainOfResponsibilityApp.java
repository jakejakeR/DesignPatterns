package patterns.chain_of_responsibility;

import patterns.chain_of_responsibility.orc_king.OrcKing;
import patterns.chain_of_responsibility.orc_king.Request;
import patterns.chain_of_responsibility.orc_king.RequestType;

public class ChainOfResponsibilityApp {
    public static void main(String[] args) {
        var king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
