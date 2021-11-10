import time
    
class Maze():
    """A pathfinding problem."""
    def __init__(self, grid, location):
        """Instances differ by their current agent locations."""
        self.grid = grid 
        self.location = location 

    def display(self):
        """Print the maze, marking the current agent location."""
        for r in range(len(self.grid)):
            for c in range(len(self.grid[r])):
                if (r, c) == self.location:
                    print('\033[96m*\x1b[0m', end=' ')   # print a blue *
                else:
                    print(self.grid[r][c], end=' ')      # prints a space or wall
            print()
        print()

    def checkDirection(self, direction):
        (r,c) = self.location

        if (direction == 'N'):
            (r,c) = (r-1, c)
            obj = self.grid[r][c]
            if (obj == ' '):
                return True
        elif (direction == 'S'):
              (r,c) = (r+1, c)
              obj = self.grid[r][c]
              if (obj == ' '):
                return True
        elif (direction == 'E'):
            (r,c) = (r, c + 1)
            obj = self.grid[r][c]
            if (obj == ' '):
                return True
        elif (direction == 'W'):
            (r,c) = (r, c - 1)
            obj = self.grid[r][c]
            if (obj == ' '):
                return True
    
 ##################################################################################################################################################################################

    def moves(self):
        """Return a list of possible moves given the CURRENT AGENT POSITION.""" 
        (r,c) = self.location
        cardinalQueue = []

        if (Maze.checkDirection(self,'N')):
            cardinalQueue.append('N')
        
        if  (Maze.checkDirection(self,'S')):
            cardinalQueue.append('S') 
        
        if  (Maze.checkDirection(self,'E')):
            cardinalQueue.append('E')  
        
        if  (Maze.checkDirection(self,'W')):
            cardinalQueue.append('W')        

        return cardinalQueue 

    def neighbor(self, move):
        """Return another Maze instance with a move made."""
        (r,c) = self.location # creating variable (r,c) makes a tuple variable hold the x and y position of self.location or the (r)ow and (c)olumn
        coordinate = {'N' : (r-1, c), 'S' : (r+1, c), 'E' : (r, c + 1), 'W' : (r, c - 1)}

        maze = Maze(self.grid,coordinate[move])
        return maze    
    
#################################################################################### END MAZE CLASS #########################################################################################

class Agent():
    """Knows how to find the exit to a maze with BFS."""

    def bfs(self, maze, goal):
        """Return an ordered list of moves to get the maze to match the goal."""
        frontier = [] 
        path = [] 
        visited = [] 
        parent = () 
        parentMoves = []
        goalFound = False
        withinList = False

        frontier.append(maze.location)
        visited.append(maze.location)
        parentMoves.append((maze.location, []))

        while len(frontier) > 0 and not goalFound:
            parentMaze = frontier.pop(0)
            temp = Maze(maze.grid, parentMaze)

            if not goalFound:
                for move in temp.moves():
                    wasVisited = False
                    childMaze = temp.neighbor(move)
                    childMaze = childMaze.location
                    for location in visited:
                        if childMaze == location:
                            wasVisited = True
                    if not wasVisited:
                        visited.append(childMaze)
                        frontier.append(childMaze)
                        for m in parentMoves:
                            if parentMaze == m[0]:
                                parent = m
                                withinList = True
                                parentMoves.append((childMaze, parent[1] + [move]))
                    if childMaze == goal.location:
                        path = parent[1] + [move]
                        goalFound = True
                        frontier.clear()
                        break;
        return path     

######################################################################################## MAIN METHOD ################################################################################

def main():
    """Create a maze, solve it with BFS, and console-animate."""

    grid = ["XXXXXXXXXXXXXXXXXXXX",
            "X     X    X       X",
            "X XXXXX XXXX XXX XXX",
            "X       X      X X X",
            "X X XXX XXXXXX X X X",
            "X X   X        X X X",
            "X XXX XXXXXX XXXXX X",
            "X XXX    X X X     X",
            "X    XXX       XXXXX",
            "XXXXX   XXXXXX     X",
            "X   XXX X X    X X X",
            "XXX XXX X X XXXX X X",
            "X     X X   XX X X X",
            "XXXXX     XXXX X XXX",
            "X     X XXX    X   X",
            "X XXXXX X XXXX XXX X",
            "X X     X  X X     X",
            "X X XXXXXX X XXXXX X",
            "X X                X",
            "XXXXXXXXXXXXXXXXXX X"]

    maze = Maze(grid, (1, 1)) 
    maze.display()
    agent = Agent()
    goal = Maze(grid, (19, 18)) 
    path = agent.bfs(maze, goal)
    agent.bfs(maze,goal)
    
    while path:
        move = path.pop(0)
        maze = maze.neighbor(move)
        time.sleep(0.50)
        maze.display() 
    
if __name__ == '__main__':
    main()
