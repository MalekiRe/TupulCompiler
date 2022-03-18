package malek.parser.addingphase.scope.typeinterface;

import malek.parser.addingphase.scope.AddingPhaseScope;
import malek.parser.addingphase.scope.nonglobals.NonGlobalSymbolScope;
import malek.parser.addingphase.scope.nonglobals.NonGlobalTypeScope;

import java.util.ArrayList;
import java.util.List;

public class TypeInterfaceScope extends NonGlobalTypeScope {
    final List<String> extendingInterfaces = new ArrayList<>();

    protected TypeInterfaceScope(String typeName, AddingPhaseScope enclosingScope) {
        super(typeName, typeName, enclosingScope);
    }

    public void addExtendingInterface(String s) {
        this.extendingInterfaces.add(s);
    }
    public List<String> getExtendingInterfaces() {
        return extendingInterfaces;
    }
}
