use mongo_practice

db.movies.insertMany(
    [
        {
            title : "Fight Club",
            writer : "Chuck Palahniuko",
            year : 1999,
            actors : [ "Brad Pitt",   "Edward Norton"  ]
            
        },
        {
            title : "Pulp Fiction",
            writer : "Quentin Tarantino",
            year : 1994,
            actors : ["John Travolta","Uma Thurman"]

        },
        {
            title:"Inglorious Basterds",
            writer:"Quentin Tarantino",
            year:2009,
            actors:["Brad Pitt","Diane Kruger","Eli Roth"]
        },
        {
            title:"The Hobbit: An Unexpected Journey",
            writer:": J.R.R. Tolkein",
            year:2012,
            franchise:"The Hobbit"
        },
        {
            title:"The Hobbit: The Desolation of Smaug",
            writer:": J.R.R. Tolkein",
            year:2013,
            franchise:"The Hobbit"
        },
        {
            title:"The Hobbit: The Battle of the Five Armies",
            writer:": J.R.R. Tolkein",
            year:2012,
            franchise:"The Hobbit",
            synopsis:"Bilbo and Company are forced to engage in a war against an array of combatants and keep the Lonely Mountain from falling into the hands of a rising darkness."
        },
        {
            title:"Pee Wee Herman's Big Adventure"
        },
        {
            title:"Avatar"
        }
    ]
)

db.users.insert(
    {
        username : "GoodGuyGreg",
        first_name : "Good Guy",
        last_name : "Greg"
          
    }
)
db.users.insert(
    {
        username : "ScumbagSteve",
        full_name :{first : "Scumbag",last : "Steve"}
    }
)

db.posts.insertMany([
    {
        username : "GoodGuyGreg",
        title : "Passes out at party",
        body : "Wakes up early and cleans house"
    },
    {
        username:"GoodGuyGreg",
        title:"Steals your identity",
        body:"Raises your credit score"
    },
    {
        username:"GoodGuyGreg",
        title:"Reports a bug in your code",
        body:"Sends you a Pull Request"
    },
    {
        username:"ScumbagSteve",
        title:"Borrows something",
        body:"Sells it"
    },
    {
        username:"ScumbagSteve",
        title:"Borrows everything",
        body:"The end"
    },
    {
        username:"ScumbagSteve",
        title:"Forks your repo on github",
        body:"Sets to private"
    },
]
)

db.comments.insertMany(
    [
        {
            username:"GoodGuyGreg",
            comment:"Hope you got a good deal!",
            post:ObjectId("61ed2ce2a5124df693f2d969")
        },
        {
            username:"GoodGuyGreg",
            comment:"What's mine is yours!",
            post:ObjectId("61ed2ce2a5124df693f2d96a")
        },
        {
            username:"GoodGuyGreg",
            comment:"Don't violate the licensing agreement!",
            post:ObjectId("61ed2ce2a5124df693f2d96b")
        },
        {
            username:"ScumbagSteve",
            comment:"It still isn't clean",
            post:ObjectId("61ed2ce2a5124df693f2d966")
        },
        {
            username:"ScumbagSteve",
            comment:"Denied your PR cause I found a hack",
            post:ObjectId("61ed2ce2a5124df693f2d968")
        }
    ]
)

