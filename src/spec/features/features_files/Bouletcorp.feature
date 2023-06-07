@bouletcorp
Feature: Je souhaite verifier les widgets sur Bouletcorp
  ETQ utuisateur je souhaite verifier les widgets sur Bouletcorp

  Scenario: Je souhaite afficher les widgets sur la page Aléatoire
    Given Je me connecte sur "http://www.bouletcorp.com"
    When Je clique sur "Aléatoire"
    Then La page change
    And Les widgets Facebook Twitter et Tumblr sont affiches
