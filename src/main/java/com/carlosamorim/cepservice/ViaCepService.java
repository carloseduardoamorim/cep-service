
package com.carlosamorim.cepservice;

import javax.enterprise.context.Dependent;

@Dependent
public final class ViaCepService extends AbstractCepServiceImpl {

    public ViaCepService() {
        super("https://viacep.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("ws/%s/json", cep);
    }
    
}
