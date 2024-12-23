idea:

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Orleans Game</title>
  <style>
    body { font-family: Arial, sans-serif; margin: 20px; }
    #game-state { white-space: pre-wrap; background: #f4f4f4; padding: 10px; border: 1px solid #ccc; }
    button { margin-top: 10px; }
  </style>
</head>
<body>
  <h1>Orleans Game</h1>
  <div id="game-state">Game state will appear here...</div>
  <button id="refresh">Refresh Game State</button>

  <script>
    const apiUrl = 'http://your-backend-url/game'; // Replace with your backend endpoint

    async function fetchGameState() {
      try {
        const response = await fetch(apiUrl);
        const data = await response.json();
        document.getElementById('game-state').textContent = JSON.stringify(data, null, 2);
      } catch (error) {
        console.error('Error fetching game state:', error);
        document.getElementById('game-state').textContent = 'Error fetching game state.';
      }
    }

    document.getElementById('refresh').addEventListener('click', fetchGameState);
    fetchGameState(); // Initial load
  </script>
</body>
</html>


```
