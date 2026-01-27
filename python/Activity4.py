def game ():
    print("User One: Enter Rock, Paper or Scissors")
    user_one = input()

    print("User Two: Enter Rock, Paper or Scissors")
    user_two = input()

    def command_handler (command):
        match(command.lower()):
            case "rock":
                return 0
            case "paper":
                return 1
            case "scissors":
                return 2

    result = (int(command_handler(user_one)) - int(command_handler(user_two)) + 3) % 3

    def who_won (command):
        match(command):
            case 0:
                print("Its a draw!")
            case 1:
                print("Player One Won!!")
            case 2:
                print("Player Two Won!!")

    who_won(result)

    """
    def play_rps(p1: str, p2:str):
        match(p1, p2):
            case(move1, move2) if move1 == move2:
                return "Its a draw"
            case("rock", "scissors") | ("paper", "rock") | ("scissors", "paper"):
                return "Player 1 Wins"
            case("scissors", "rock") | ("rock", "paper") | ("paper", "scissors"):
                return "Player 2 Wins"
    """

match_res = True
while(match_res):
    game()
    print("Do you want to play another match?")
    choice = input()
    match (choice.lower()):
        case("yes" | "y"):
            match_res = True
        case("no" | "n"):
            match_res = False
        case _:
            print("invalid")
            match_res = False
    