# Ecommerce

Datomic studies with Clojure

## Usage

To start, you need to install datomic in your machine. You can download it from [here](https://docs.datomic.com/setup/pro-setup.html#get-datomic).
After that, you need to unzip the downloaded file and move the file
`<datomic-VERSION>/samples/dev-transactor-template.properties` to the root of `<datomic-VERSION>`.

In terminal, go to the directory and run the following command:

`bin/transactor config/dev-transactor-template.properties`. The ouptut should be something like this:

; Launching with Java options -server -Xms1g -Xmx1g -XX:+UseG1GC -XX:MaxGCPauseMillis=50

; System started

After that, open this project on InteliJ IDEA and start the REPL.
```bash
## License

Copyright © 2024 Ecommerce

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
# ecommerce-datomic
