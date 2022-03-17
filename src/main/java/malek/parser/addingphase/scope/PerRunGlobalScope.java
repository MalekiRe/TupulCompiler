package malek.parser.addingphase.scope;

import malek.buildtool.printlib.PrintLib;

public class PerRunGlobalScope extends TrueGlobalScope {
    public static PerRunGlobalScope get() {
        return new PerRunGlobalScope();
    }
    @Override
    public String getScopeName() {
        return "PerRunGlobal";
    }

    @Override
    public AddingPhaseScope getEnclosingScope() {
        return TrueGlobalScope.get();
    }

    public void printScope() {
        this.printScope(0);
    }
}
