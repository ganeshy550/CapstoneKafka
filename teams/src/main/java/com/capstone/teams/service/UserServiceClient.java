package com.capstone.teams.service;

import com.capstone.teams.dto.PlayerStatsDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class UserServiceClient {

    private final WebClient webClient;

    public UserServiceClient(@Value("${team.service.url}") String teamServiceUrl, WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(teamServiceUrl).build();
    }

    public Mono<String> getUserDetails(String userId) {
        return webClient.get()
                .uri("/api/user/{userId}", userId)
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<Void> updateTeam(String userId, String teamId) {
        // PlayerUpdationRequest request = new PlayerUpdationRequest();
        // request.setTeamId(userTeamId);
        
        return webClient.put()
                .uri("/api/user/updateTeam/{userId}/{teamId}", userId, teamId)
                .retrieve()
                .bodyToMono(Void.class);
    }

    public Mono<PlayerStatsDTO> getCurrentStats(String userId) {
        return webClient.get()
                .uri("/api/user/stats/{userId}", userId)
                .retrieve()
                .bodyToMono(PlayerStatsDTO.class);
    }
}