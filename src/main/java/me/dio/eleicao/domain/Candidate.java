package me.dio.eleicao.domain;
import java.util.Optional;

public record Candidate(int id, String name, String email, Optional<String> phone, Party party){
}
