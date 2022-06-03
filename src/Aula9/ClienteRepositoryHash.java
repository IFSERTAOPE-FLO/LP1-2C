package Aula9;

import java.util.HashMap;

public class ClienteRepositoryHash {

        private HashMap<Integer, Cliente> repository;

        public ClienteRepositoryHash(){
            this.repository = new HashMap<Integer, Cliente>();
        }
        public void inserir(Cliente cliente){
            repository.put(cliente.getCpf(), cliente);
        }
        public HashMap getAll(){
            return repository;
        }
        public Cliente getOne(int cpf){
            return repository.get(cpf);
        }
    }
