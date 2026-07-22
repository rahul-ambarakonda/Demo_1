This `CONTEXT.md` provides an overview of the `Demo_1` project, reflecting its current state after initial setup.

### What this project does

The `Demo_1` project currently serves as a minimal full-stack web application demonstrating basic data persistence and retrieval. It provides a simple API backend and a corresponding user interface to interact with the data.

### Tech Stack and Architecture

The `Demo_1` project is built with the following core technologies:
*   **Backend**: Node.js with Express.js for the API server.
*   **Frontend**: React.js for the single-page application user interface.
*   **Database**: SQLite for local, file-based data storage.
*   **Containerization**: Docker for packaging and running services; Docker Compose for local multi-service orchestration.
*   **Architecture**: A standard client-server architecture where the React frontend consumes a RESTful API exposed by the Node.js backend.

### Key Directories and their purpose

The project structure is organized as follows:
*   `client/`: Contains the source code for the React frontend application.
*   `server/`: Contains the source code for the Node.js Express backend API.
*   `data/`: Stores persistent data, such as the SQLite database file.
*   `docker/`: Docker-related configuration files (e.g., `Dockerfile`s for client/server, `docker-compose.yml`).
*   `scripts/`: Contains utility scripts for building, testing, and deployment tasks.
*   `README.md`: Provides a general overview of the project and instructions for setup and running.

### Important Conventions or Patterns

Key conventions and patterns established in the project include:
*   **Coding Style**: ESLint and Prettier are configured for consistent JavaScript/TypeScript code formatting across client and server.
*   **API Design**: The backend API adheres to RESTful principles for endpoint design, request/response formats, and error handling.
*   **Dependency Management**: `package.json` files are used in both `client/` and `server/` directories to manage Node.js dependencies.
*   **Local Development**: Docker Compose facilitates setting up and running both frontend and backend services locally with a single command.

This `CONTEXT.md` will be updated as the project structure and codebase grow to reflect the actual implementation details.

Tickets implemented in this sprint: MC-2, MC-3, MC-4, MC-5, MC-7, MC-8, MC-10, MC-11