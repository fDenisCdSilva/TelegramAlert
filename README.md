# TeleAviso Project

This project is a simple client to send messages via Telegram using the Telegram Bot API. It consists of two main classes: `App` and `Connection`. The goal is to send a message to a Telegram chat by providing a bot token, chat ID, and the message.

## Prerequisites

Before you begin, make sure you have the following tools installed on your machine:

- **Java 8 or higher** (to compile and run the code)
- **IDE of your choice** (e.g., IntelliJ IDEA, Eclipse, etc.)
- **Telegram Bot Token**: You need to create a bot on [BotFather](https://core.telegram.org/bots#botfather) on Telegram and get your authentication token.
- **Telegram Chat ID**: You can obtain the chat ID using the Telegram API or a specialized bot.

## Dependencies

This project does not have external dependencies but uses standard Java libraries, such as:

- `java.net.HttpURLConnection`
- `java.io.InputStreamReader`
- `java.io.BufferedReader`
- `java.io.OutputStream`

## How to Use

1. Clone this repository to your local machine:
    ```bash
    git clone https://github.com/YOUR_USERNAME/TELEAVISO.git
    ```

2. Compile the code:
    ```bash
    javac co/projetc/teleaviso/App.java
    javac co/projetc/teleaviso/Connection.java
    ```

3. Run the code, passing the **bot token**, **chat ID**, and **message** as command-line arguments:
    ```bash
    java src.App <BOT_TOKEN> <CHAT_ID> <MESSAGE>
    ```

    Example:
    ```bash
    java src.App 123456789:ABCDEFghijklmnopqrstuvwx 987654321 "Hello, this is a test message!"
    ```

4. The code will send the message to the Telegram chat.

## Code Explanation

### `App` Class

The `App` class is the main entry point that performs the task of sending the message. It receives three command-line parameters:

- `token`: The Telegram bot token.
- `chatID`: The ID of the chat where the bot will send the message.
- `msg`: The text message to be sent.

The `main` method creates an instance of the `Connection` class and calls the `sendMsg()` method to send the message to Telegram.

### `Connection` Class

The `Connection` class contains the `sendMsg()` method, which is responsible for constructing the request URL to the Telegram API and sending the message via an HTTP POST request.

- The method uses the bot's token, chat ID, and message text to send the HTTP request to Telegram.
- The API's response is checked to ensure the message was successfully sent.

## Contributing

If you'd like to contribute to this project, feel free to open a "Pull Request" with your improvements or fixes.

## License

This project is licensed under the [MIT License](LICENSE).

