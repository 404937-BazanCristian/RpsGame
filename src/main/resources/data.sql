INSERT INTO players (id, user_name, password, email, avatar, last_login, created_at, updated_at)
VALUES (1000000, 'APP', null, null, null, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO players(id, user_name, password, email, avatar, last_login, created_at, updated_at)
VALUES (100, 'cristian', 'Password03#', 'email@email.com', null, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO games (id, code, name, description, rules)
VALUES (1000000, 'RPS', 'Rock Paper Scissors',
        'Rock paper scissors id a simple hands game' ||
        'the game involve each player simultaneously forming one of three shapes',
        'R for Rock, P for Paper and S for Scissors' ||
        'The objective is to defeat the opponent by selecting a hand shape that defeats their choice');

INSERT INTO matches(id, game_id, player1_id, player2_id, created_at, updated_at, status)
VALUES (1000000, 1000000, 100, 1000000, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'STARTED');
INSERT INTO matches(id, game_id, player1_id, player2_id, created_at, updated_at, status)
VALUES (1000001, 1000000, 100, 1000000, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'FINISHED');
INSERT INTO matches(id, game_id, player1_id, player2_id, created_at, updated_at, status)
VALUES (1000002, 1000000, 100, 1000000, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'CANCELED');

INSERT INTO matches_rps(id, number_of_plays, remainder_plays, player1score, player2score)
VALUES (1000000,10, 5, 3, 2);
INSERT INTO matches_rps(id, number_of_plays, remainder_plays, player1score, player2score, winner_id)
VALUES (1000001, 10, 0, 6, 4, 100);
INSERT INTO matches_rps(id, number_of_plays, remainder_plays, player1score, player2score)
VALUES (1000002, 10, 5, 3, 2);

INSERT INTO plays_rps(id, match_rps_id,shape_hand_player1, shape_hand_player2, winner_id)
VALUES (1000000, 1000000, 'ROCK', 'PAPER', 1000000);
INSERT INTO plays_rps(id, match_rps_id,shape_hand_player1, shape_hand_player2, winner_id)
VALUES (1000001, 1000000, 'PAPER', 'ROCK', 100);
INSERT INTO plays_rps(id, match_rps_id,shape_hand_player1, shape_hand_player2, winner_id)
VALUES (1000002, 1000000, 'PAPER', 'ROCK', 100);
INSERT INTO plays_rps(id, match_rps_id,shape_hand_player1, shape_hand_player2, winner_id)
VALUES (1000003, 1000000, 'ROCK', 'SCISSORS', 100);
INSERT INTO plays_rps(id, match_rps_id,shape_hand_player1, shape_hand_player2, winner_id)
VALUES (1000004, 1000000, 'ROCK', 'PAPER', 1000000);
