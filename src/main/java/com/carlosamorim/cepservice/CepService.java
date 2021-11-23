
package com.carlosamorim.cepservice;

import com.carlosamorim.cepsercice.model.Endereco;

/**
 *
 * @author cadua
 */
public interface CepService {
    Endereco buscaEndereco(String cep);
}
