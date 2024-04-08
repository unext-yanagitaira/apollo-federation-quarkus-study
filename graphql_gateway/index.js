const { ApolloServer } = require("apollo-server");
const { ApolloGateway, IntrospectAndCompose } = require("@apollo/gateway");

const gateway = new ApolloGateway({
  supergraphSdl: new IntrospectAndCompose({
    subgraphs: [
      {
        name: "author",
        url: "http://localhost:4001/graphql",
      },
      {
        name: "book",
        url: "http://localhost:4002/graphql",
      },
    ],
  }),
});

const server = new ApolloServer({
  gateway,
  subscriptions: false,
});

server
  .listen()
  .then(({ url }) => {
    console.log(`🚀  Gateway ready at ${url}`);
  })
  .catch((err) => {
    console.error(err);
  });
