package malek.parser.llvmphase;

import generated.malek.TupulBaseVisitor;

public class LLVMPhase extends TupulBaseVisitor<Object> {
    /*
    The things i need to know what a function is.
    I need the return type. I need the argument types. All my return types and argument types that are not pure primitives will be struct pointers.
    I need to adjust the name so it is aware of the different ereturn types and arugment types to seperate it from others.

     */
}
